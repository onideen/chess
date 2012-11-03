package game;

public enum PieceColor {
	WHITE, BLACK;
	
	public PieceColor getOtherColor() {
		return this == WHITE ? BLACK : WHITE;
	}
}
