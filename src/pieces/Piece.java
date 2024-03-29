package pieces;
import game.Board;
import game.PieceColor;


public interface Piece {
	public PieceColor getPieceColor();
	public boolean canTake(String from, String to, Board board);
	public boolean canMove(String from, String to, Board board);
}
