package a1;

import java.util.ArrayList;

public class Knight extends ChessPiece {

	public Knight(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		if (this.color == Color.BLACK)
			return "\u265E";
		else
			return "\u2658";
	}

	@Override
	public ArrayList<String> legalMoves() {		
		// in this implementation, knights don't move
		
		ArrayList<String> moves = new ArrayList<>();		
		
		return moves;
	}

}
