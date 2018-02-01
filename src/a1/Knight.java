package a1;

import java.util.ArrayList;

public class Knight extends ChessPiece {

	public Knight(ChessBoard board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		
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