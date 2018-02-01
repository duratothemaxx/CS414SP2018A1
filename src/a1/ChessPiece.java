package a1;

import java.util.ArrayList;

// The abstract class ChessPiece is the parent class for 
// all the actual chess pieces classes. This class keeps
// a reference to the board the piece is on (if any), stores 
// the position where the piece is located, and the color.
public abstract class ChessPiece {

	public enum Color {
		WHITE, BLACK
	}

	protected ChessBoard board; // the board it belongs to, default null
	protected int row; // the index of the horizontal rows 0..7
	protected int column; // the index of the vertical column 0..7
	protected Color color; // the color of the piece

	// This constructor sets the board and color attributes
	public ChessPiece(ChessBoard board, Color color) {
		
		this.board = board;
		this.color = color;

	}
	
	// This method returns the color of the piece. 
	// There is no need for a setColor method 
	// because a piece cannot change color.
	public Color getColor() {
		return this.color;
		
	}
	
	// This method returns the position of the piece in the format
	// single letter (a..h) followed by a single digit (1..8).
	public String getPosition() {
		// rows are numbers and colums are letters
		// row 1 = index 0, etc
		// col a = index 0, etc
		String position = "" + (char) (column+98) + "" + (char) (row+50);
		return position;		
	}
	
	// This method sets the position of the piece to the appropriate 
	// row and column based on the argument, which in the format 
	// single letter (a..h) followed by a single digit (1..8). 
	// If the position is illegal for any of the two reasons 
	// mentioned earlier, throw the stated exception. 
	public void setPosition(String position) throws IllegalPositionException {
		row = position.charAt(1)-50;
		column = position.charAt(0)-98;
		
		if(row < 0 || row > 7 || column < 0 || column > 7)
			throw new IllegalPositionException("Position '" + position + "' is not valid");		
	}
	
	// This method will be implemented in the concrete subclasses
	// corresponding to each chess piece. This method returns a String
	// composed of a single character that corresponds to which piece
	// it is. In the unicode character encoding scheme there are
	// characters that represent each chess piece.
	// Use one of the following characters:
	
	/* character     piece
	 ----------   -----------
	   "\u2654"   white king
	   "\u2655"   white queen
	   "\u2656"   white rook
	   "\u2657"   white bishop
	   "\u2658"   white knight
	   "\u2659"   white pawn
	   "\u265A"   black king
	   "\u265B"   black queen
	   "\u265C"   black rook
	   "\u265D"   black bishop
	   "\u265E"   black knight
	   "\u265F"   black pawn
	*/
	abstract public String toString();
	
	
	// This method will be implemented in the concrete subclasses corresponding 
	// to each chess piece. This method returns all the legal moves that piece 
	// can make based on the rules described above in the assignment. Each string 
	// in the ArrayList should be the position of a possible destination for the 
	// piece (in the same format described above). If there are multiple legal 
	// moves, the order of moves in the ArrayList does not matter. If there are 
	// no legal moves, return an empty ArrayList, i.e., the size should be zero.
	abstract public ArrayList<String> legalMoves();
	

	public static void main(String[] args) {
		System.out.println("\u2654   white king\n" + 
				"\u2655   white queen\n" + 
				"\u2656   white rook\n" + 
				"\u2657   white bishop\n" + 
				"\u2658   white knight\n" + 
				"\u2659   white pawn\n" + 
				"\u265A   black king\n" + 
				"\u265B   black queen\n" + 
				"\u265C   black rook\n" + 
				"\u265D   black bishop\n" + 
				"\u265E   black knight\n" + 
				"\u265F   black pawn\n");
	}
}