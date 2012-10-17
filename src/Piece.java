
public abstract class Piece {
	
	private Board board;
	private Color color;
	
	public Piece(Board board, Color color) {
		this.board = board;
		this.color = color;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract boolean isValidMove(int startX, int startY, int endX, int endY);
	
	
}
