import static org.junit.Assert.*;

import org.junit.*;

public class PiecesTest {
	
	private Board board;
	
	@Before
	public void setup() {
		board = new Board();
	}
	
	@Test
	public void testKingOutput() {
		Piece whiteKing = new King(board, Color.WHITE);
		Piece blackKing = new King(board, Color.BLACK);
		
		assertEquals("K", whiteKing.toString());
		assertEquals("k", blackKing.toString());
	}
	
	@Test
	public void testQueenOutput() {
		Piece whiteQueen = new Queen(board, Color.WHITE);
		Piece blackQueen = new Queen(board, Color.BLACK);
		
		assertEquals("Q", whiteQueen.toString());
		assertEquals("q", blackQueen.toString());
	}
	
	@Test
	public void testKnightOutput() {
		Piece whiteKnight = new Knight(board, Color.WHITE);
		Piece blackKnight = new Knight(board, Color.BLACK);
		
		assertEquals("N", whiteKnight.toString());
		assertEquals("n", blackKnight.toString());
	}
	
	@Test
	public void testRookOutput() {
		Piece whiteRook = new Rook(board, Color.WHITE);
		Piece blackRook = new Rook(board, Color.BLACK);
		
		assertEquals("R", whiteRook.toString());
		assertEquals("r", blackRook.toString());
	}
	
	@Test
	public void testBishopOutput() {
		Piece whiteBishop = new Bishop(board, Color.WHITE);
		Piece blackBishop = new Bishop(board, Color.BLACK);
		
		assertEquals("B", whiteBishop.toString());
		assertEquals("b", blackBishop.toString());
	}
	
	@Test
	public void testPawnOutput() {
		Piece whiteBishop = new Pawn(board, Color.WHITE);
		Piece blackBishop = new Pawn(board, Color.BLACK);
		
		assertEquals("P", whiteBishop.toString());
		assertEquals("p", blackBishop.toString());
	}
	
}
