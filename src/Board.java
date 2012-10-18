
public class Board {
	
	private final int BOARD_SIZE = 8;
	
	private Piece[][] board;
	
	public Board() {
		initBoard();
	}
	
	private void initBoard() {
		board = new Piece[BOARD_SIZE][BOARD_SIZE];
		arrangePieces(Color.WHITE);
		arrangePieces(Color.BLACK);
	}

	private void arrangePieces(Color color) {
		int mainY = (color == Color.WHITE ? 0 : 7);
		int pawnY = (color == Color.WHITE ? 1 : 6);
		board[0][mainY] = new Rook(this, color);
		board[1][mainY] = new Knight(this, color);
		board[2][mainY] = new Bishop(this, color);
		board[3][mainY] = new Queen(this, color);
		board[4][mainY] = new King(this, color);
		board[5][mainY] = new Bishop(this, color);
		board[6][mainY] = new Knight(this, color);
		board[7][mainY] = new Rook(this, color);
		
		for (int i = 0; i < BOARD_SIZE; i++) {
			board[i][pawnY] = new Pawn(this, color);
		}		
	}

	public boolean isEmpty(int x, int y){
		return board[x][y] == null;
	}
	
	public Color getPieceColor(int x, int y) {
		if ( ! isOnBoard(x, y)) return null;
		else return board[x][y].getColor();
	}
	
	public boolean isOnBoard(int x, int y) {
		return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder board = new StringBuilder();
		
		for (int y = BOARD_SIZE-1; y >= 0; y--) {
			board.append("+-------------------------------+\n");
			board.append("| ");
			for (int x = 0; x < BOARD_SIZE; x++) {
				board.append(this.board[x][y] == null ? " " : this.board[x][y]);
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

	public Piece getPieceAt(int x, int y) {
		if (isOnBoard(x, y))
			return board[x][y];
		else return null;
	}
}
