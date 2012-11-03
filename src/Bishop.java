
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
	
}
