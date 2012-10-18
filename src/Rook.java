
public class Rook extends Piece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		return false;
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.WHITE) return "R";
		else return "r";
	}
}
