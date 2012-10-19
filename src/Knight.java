
public class Knight extends Piece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		return isEmptyOrOpositeColor(endX, endY) && (Math.abs(endX - startX) == 1 && Math.abs(endY - startY) == 2) || (Math.abs(endX - startX) == 2 && Math.abs(endY - startY) == 1);
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.WHITE) return "N";
		else return "n";
	}
}
