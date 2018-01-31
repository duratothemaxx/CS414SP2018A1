package a1;

import java.util.ArrayList;

public class Queen extends ChessPiece {

	public Queen(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		if (this.color == Color.BLACK)
			return "\u265B";
		else
			return "\u2655";
	}

	@Override
	public ArrayList<String> legalMoves() {		
		// in this implementation, Queens don't move
		
		ArrayList<String> moves = new ArrayList<>();		
		
		return moves;
	}

}
