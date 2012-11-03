package pieces;
import game.Board;
import game.PieceColor;


public abstract class AbstractPiece implements Piece {
	
	private PieceColor color;
	
	public AbstractPiece(PieceColor color) {
		this.color = color;
	}
	
	public PieceColor getPieceColor() {
		return color;
	}
	
	public boolean canTake(String from, String to, Board board) {
		return canMove(from, to, board);
	}
}
