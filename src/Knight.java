
public class Knight extends AbstractPiece {

	public Knight(PieceColor color) {
		super(color);
	}
	
	@Override
	public String toString() {
		if (this.getPieceColor()==PieceColor.BLACK) {
			return "J";
		}
		else {
			return "j";
		}
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return Math.abs(Board.getColumnDistance(from, to) * Board.getRowDistance(from, to)) == 2;
			}

}
