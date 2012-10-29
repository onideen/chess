
public class Rook extends AbstractPiece {

	public Rook(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return Board.isStraight(from, to) && (! board.isOccupiedBetween(from, to));
	}

	
}
