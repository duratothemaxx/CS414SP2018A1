package a1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import a1.ChessPiece.Color;

public class KingTest {

	private ChessBoard board;
	private King whiteKing;

	@Before
	public void setUp() throws Exception {
		board = new ChessBoard();
		whiteKing = new King(board, Color.WHITE);
		board.placePiece(whiteKing, "b2");
	}

	@Test
	public void testLegalMoves() {
		assertTrue(whiteKing.legalMoves().contains("a1"));
		assertTrue(whiteKing.legalMoves().contains("c3"));
	}

	@Test
	public void testGetPosition() throws IllegalPositionException {
		assertTrue(whiteKing.getPosition().equals("b2"));
	}

	@Test
	public void testSetPosition() throws IllegalPositionException {
		whiteKing.setPosition("c3");
		assertTrue(whiteKing.getPosition().equals("c3"));
	}
}