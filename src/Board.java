public class Board {

	private final static int BOARD_SIZE = 8;

	private AbstractPiece[][] pieces;

	public Board() {
	}

	public AbstractPiece getPiece(String position) {
		return getPiece(getColumnIndex(position), getRowIndex(position));
	}

	private AbstractPiece getPiece(int column, int row) {
		return pieces[row][column];
	}

	public void setPiece(String position, AbstractPiece piece) {
		pieces[getRowIndex(position)][getColumnIndex(position)] = piece;
	}

	private static int getColumnIndex(String position) {
		return position.charAt(0) - 'a';
	}

	private static int getRowIndex(String position) {
		return position.charAt(1) - '1';
	}

	public static boolean isStraight(String from, String to) {
		return getColumnDistance(from, to) == 0
				|| getRowDistance(from, to) == 0;
	}

	public static boolean isDiagonal(String from, String to) {
		return getColumnDistance(from, to) == getRowDistance(from, to);
	}

	public boolean isOccupiedBetween(String from, String to) {
		int fromColumn = getColumnIndex(from);
		int fromRow = getRowIndex(from);
		int toColumn = getColumnIndex(to);
		int toRow = getRowIndex(to);
		int dColumn = (fromColumn == toColumn ? 0 : (toColumn - fromColumn) 
						/ Math.abs(toColumn - fromColumn));
		int dRow = (fromRow == toRow ? 0 : (toRow - fromRow)
				/ Math.abs(toRow - fromRow));
		for (int column = fromColumn + dColumn, row = fromRow + dRow; column != toColumn
				|| row != toRow; column += dColumn, row += dRow) {
			if (getPiece(column, row) != null) {
				return true;
			}
		}
		return false;
	}

	private static int getRowDistance(String from, String to) {
		return getRowIndex(to) - getRowIndex(from);
	}

	private static int getColumnDistance(String from, String to) {
		return getColumnIndex(to) - getColumnIndex(from);
	}

	public static void validateBoardPosition(String position) {
		
		int column = getColumnIndex(position);
		int row = getRowIndex(position);
		
		if (column < 0 || column >= BOARD_SIZE || row < 0 || row >= BOARD_SIZE ) throw new IllegalBoardPosition(position);
	}
	
	public boolean isLegalMove(PieceColor pieceColor, String from, String to) {
		try {
			validateBoardPosition(from);
			validateBoardPosition(to);
		} catch (IllegalBoardPosition e) { return false;}
		
		Piece myPiece = getPiece(from);
		Piece toPiece = getPiece(to);
		if(myPiece == null || myPiece.getPieceColor() != pieceColor ) return false;
		
		return (toPiece != null && toPiece.getPieceColor() != pieceColor) ? myPiece.canTake(from, to, this) : toPiece == null && myPiece.canMove(from, to, this);
	}
	
	@Override
	public String toString() {

		StringBuilder board = new StringBuilder();

		for (int y = BOARD_SIZE - 1; y >= 0; y--) {
			board.append("+-------------------------------+\n");
			board.append("| ");
			for (int x = 0; x < BOARD_SIZE; x++) {
				board.append(getPiece(x, y) == null ? " " : getPiece(x, y));
				board.append(" | ");
			}
			board.append("\n");
		}
		board.append("+-------------------------------+\n");

		return board.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Board());
	}

}
