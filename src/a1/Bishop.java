package a1;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

	public Bishop(ChessBoard board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {

		if (this.color == Color.BLACK)
			return "\u265D";
		else
			return "\u2657";
	}

	@Override
	public ArrayList<String> legalMoves() {
		
		ArrayList<String> moves = new ArrayList<String>();
		
		// Bishops need to follow 1 rule:
		// 1. they can capture and move diagonally
		
		if (this.color == Color.WHITE) {

		} else {

		}
		
		
		return moves;
	}

}
