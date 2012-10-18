
public class King extends Piece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		return false;
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.WHITE) return "K";
		else return "k";
	}
}
