package a1;

public class ChessBoard {

	private ChessPiece[][] board;
	private static final int BOARDSIZE = 8;

	// initializes the board to an 8X8 array with all
	// empty squares. An empty square is null
	ChessBoard() {

		for (int i = 0; i < BOARDSIZE; i++) {
			for (int j = 0; j < BOARDSIZE; j++) {
				board[i][j] = null;
			}
		}

	}

	// This method initializes the board to the standard chess
	// opening state with indexing as shown in the figure.
	// This method should use the constructors of the appropriate
	// pieces, and call placePiece below to place the newly
	// constructed pieces in the right position.
	public void initialize() {

	}

	// This method returns the chess piece at a given position.
	// The position is represented as a two-character string
	// (e.g., e8) as described above. The first letter is in lowercase
	// (a..h) and the second letter is a digit (1..8). If the
	// position is illegal because the string contains illegal
	// characters or represents a position outside the board, the exception is
	// thrown.
	public ChessPiece getPiece(String position) throws IllegalPositionException {
		return null;

	}

	// This method tries to place the given piece at a given position,
	// and returns true if successful, and false if there is already
	// a piece of the same player in the given position or the
	// position was illegal for any of the two reasons mentioned
	// in the description of getPiece. If an opponent's piece exists,
	// that piece is captured. If successful, this method should
	// call an appropriate method in the ChessPiece class
	// (i.e., setPosition) to set the piece's position.
	public boolean placePiece(ChessPiece piece, String position) {
		return false;

	}

	// This method checks if moving the piece from the fromPosition to
	// toPosition is a legal move. Legality is defined based on the
	// rules described above in Section 2.1. If the move is legal,
	// it executes the move, changing the value of the board as needed.
	// Otherwise, the stated exception is thrown.
	public void move(String fromPosition, String toPosition) throws IllegalMoveException {

	}

	// You must include the following toString method to help debug your program.
	// We assume that ChessPiece has an appropriately implemented
	// toString method, whose implementation is described below.
	public String toString() {
		
		// provided toString code for debugging
		String chess = "";
		String upperLeft = "\u250C";
		String upperRight = "\u2510";
		String horizontalLine = "\u2500";
		String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
		String verticalLine = "\u2502";
		String upperT = "\u252C";
		String bottomLeft = "\u2514";
		String bottomRight = "\u2518";
		String bottomT = "\u2534";
		String plus = "\u253C";
		String leftT = "\u251C";
		String rightT = "\u2524";

		String topLine = upperLeft;
		for (int i = 0; i < 7; i++) {
			topLine += horizontal3 + upperT;
		}
		topLine += horizontal3 + upperRight;

		String bottomLine = bottomLeft;
		for (int i = 0; i < 7; i++) {
			bottomLine += horizontal3 + bottomT;
		}
		bottomLine += horizontal3 + bottomRight;
		chess += topLine + "\n";

		for (int row = 7; row >= 0; row--) {
			String midLine = "";
			for (int col = 0; col < 8; col++) {
				if (board[row][col] == null) {
					midLine += verticalLine + " \u3000 ";
				} else {
					midLine += verticalLine + " " + board[row][col] + " ";
				}
			}
			midLine += verticalLine;
			String midLine2 = leftT;
			for (int i = 0; i < 7; i++) {
				midLine2 += horizontal3 + plus;
			}
			midLine2 += horizontal3 + rightT;
			chess += midLine + "\n";
			if (row >= 1)
				chess += midLine2 + "\n";
		}

		chess += bottomLine;
		return chess;

	}

	public static void main(String[] args) throws IllegalMoveException {
		ChessBoard board = new ChessBoard();
		board.initialize();
		System.out.println(board);
		board.move("c2", "c4");
		System.out.println(board);
	}

}
