package a1;

import java.util.ArrayList;

public class Rook extends ChessPiece {

	public Rook(ChessBoard board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {

		if (this.color == Color.BLACK)
			return "\u265C";
		else
			return "\u2656";
	}

	@Override
	public ArrayList<String> legalMoves() {
		return null;
	}

}
