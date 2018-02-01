package a1;

import java.util.ArrayList;

public class King extends ChessPiece {

	public King(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		if (this.color == Color.BLACK)
			return "\u265A";
		else
			return "\u2654";
	}

	@Override
	public ArrayList<String> legalMoves() {
		ArrayList<String> moves = new ArrayList<String>();

		// the king can move any direction, one square at a time
		// up to 8 possible moves

		// get the current position and create a list of legal moves
		// they may not be valid when ChessBoard.move() is called, but
		// that method will handle the exceptions as needed
		int currentRank = this.getPosition().charAt(1) - 49;
		int currentFile = this.getPosition().charAt(0) - 97;

		for (int i = currentRank - 1; i <= currentRank + 1; i++) {
			for (int j = currentFile - 1; j <= currentFile + 1; j++) {

				// the current position can't be a valid move
				if (i == currentRank && j == currentFile) {
					continue;
				}

				char rank = (char) (i + 49);
				char file = (char) (j + 97);
				String move = "" + file + "" + rank;
				moves.add(move);

			}
		}

		return moves;
	}
}