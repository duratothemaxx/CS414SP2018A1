package a1;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

	public Pawn(ChessBoard board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {

		if (this.color == Color.BLACK)
			return "\u265F";
		else
			return "\u2659";
	}

	@Override
	public ArrayList<String> legalMoves() {
		
		ArrayList<String> moves = new ArrayList<String>();
		
		// pawns need to follow 3 rules:
		// 1. they can only move forward, assuming there is no piece in their way
		// 2. they can only capture diagonally, but do not need to capture
		// 3. the can optionally move forward 2 squares on the first move
		// white pawns advance from rank 2 "up" to rank 8
		// black pawns advance from rank 7 "down to rank 1

		if (this.color == Color.WHITE) {

		} else {

		}
		
		
		
		
		
		return moves;
	}

}
