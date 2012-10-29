
public class Queen extends AbstractPiece {

	public Queen(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return (Board.isDiagonal(from, to) || Board.isStraight(from, to)) && ( ! board.isOccupiedBetween(from, to));
	}

}
