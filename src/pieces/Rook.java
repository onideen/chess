package pieces;
import game.Board;
import game.PieceColor;


public class Rook extends AbstractPiece {

	public Rook(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return Board.isStraight(from, to) && (! board.isOccupiedBetween(from, to));
	}

	@Override
	public String toString() {
		return getPieceColor() == PieceColor.WHITE ? "R" : "r";
	}
}
