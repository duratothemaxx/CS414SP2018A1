package a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a1.ChessPiece.Color;

public class QueenTest {

	private Queen blackQueen;
	private Queen whiteQueen;

	@Before
	public void setUp() throws Exception {
		blackQueen = new Queen(null, Color.BLACK);
		whiteQueen = new Queen(null, Color.BLACK);
	}

	@Test
	public void testLegalMoves() {
		assertTrue("empty moves list - queen", blackQueen.legalMoves().isEmpty());
		assertTrue("empty moves list - queen", whiteQueen.legalMoves().isEmpty());
	}

	@Test
	public void testQueen() {
		assertTrue(blackQueen.color == Color.BLACK);
		assertFalse(whiteQueen.color == Color.WHITE);
	}
}