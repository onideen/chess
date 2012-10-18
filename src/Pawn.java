
public class Pawn extends Piece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		return false;
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.WHITE) return "P";
		else return "p";
	}
}
