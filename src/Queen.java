
public class Queen extends Piece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		return false;
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.WHITE) return "Q";
		else return "q";
	}
}
