package a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a1.ChessPiece.Color;

public class KnightTest {

	private Knight blackKnight;
	private Knight whiteKnight;

	@Before
	public void setUp() throws Exception {
		blackKnight = new Knight(null, Color.BLACK);
		whiteKnight = new Knight(null, Color.WHITE);
	}

	@Test
	public void testLegalMoves() {
		assertTrue("empty moves list - knight", blackKnight.legalMoves().isEmpty());
		assertTrue("empty moves list - knight", whiteKnight.legalMoves().isEmpty());
	}

	@Test
	public void testKnight() {
		assertTrue(blackKnight.color == Color.BLACK);
		assertFalse(whiteKnight.color == Color.BLACK);
	}
}