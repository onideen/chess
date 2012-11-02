
public class Knight extends AbstractPiece {

	public Knight(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return Math.abs(Board.getColumnDistance(from, to) * Board.getRowDistance(from, to)) == 2;
			}

}
