
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
	
	public boolean isEmptyOrOpositeColor(int endX, int endY) {
		return board.isEmpty(endX, endY) || board.getPieceColor(endX, endY) != color; 
	}
	
	public abstract boolean isValidMove(int startX, int startY, int endX, int endY);
	
	
}
