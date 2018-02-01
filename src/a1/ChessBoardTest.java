package a1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import a1.ChessPiece.Color;

public class ChessBoardTest {

	ChessBoard board;

	@Before
	public void setUp() throws Exception {
		board = new ChessBoard();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testChessBoard() {
		board = new ChessBoard();
		assertFalse(board == null);
	}

	@Test
	public void testInitialize() {
		board.initialize();
		ChessPiece blackPawn = new Pawn(board, Color.BLACK);
		ChessPiece whitePawn = new Pawn(board, Color.WHITE);
		try {
			board.getPiece("a7").equals(blackPawn);
			board.getPiece("e2").equals(whitePawn);
		} catch (IllegalPositionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetPiece() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlacePiece() {
		fail("Not yet implemented");
	}

	@Test
	public void testMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
}