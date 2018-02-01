package a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a1.ChessPiece.Color;

public class RookTest {
	
	private ChessBoard board;
	private Rook rook;

	@Before
	public void setUp() throws Exception {
		board = new ChessBoard();
		rook = new Rook(board, Color.BLACK);
		board.placePiece(rook, "a1");
	}

	@Test
	public void testLegalMoves() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosition() {
		assertTrue(rook.getPosition().equals("a1"));
	}
}