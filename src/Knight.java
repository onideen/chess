
public class Knight extends Piece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		return getBoard().getPieceColor(endX, endY) != getColor() && (Math.abs(endX - startX) == 1 && Math.abs(endY - startY) == 2) || (Math.abs(endX - startX) == 2 && Math.abs(endY - startY) == 1);
	}

}
