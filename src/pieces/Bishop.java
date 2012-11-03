package pieces;
import game.Board;
import game.PieceColor;


public class Bishop extends AbstractPiece {

	public Bishop(PieceColor color) {
		super(color);
	}
	
	@Override
	public String toString() {
		if (this.getPieceColor()==PieceColor.BLACK) {
			return "B";
		}
		else {
			return "b";
		}
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return Board.isDiagonal(from, to) && (! board.isOccupiedBetween(from, to));
	}

	@Override
	public String toString() {
		return getPieceColor() == PieceColor.WHITE ? "B" : "b";
	}
	
}
