
public class Board {
	
	private final int BOARD_SIZE = 8;
	
	private Piece[][] board;
	
	public boolean isEmpty(int x, int y){
		return board[x][y] == null;
	}
	
	private void init(){
		
	}
	
	public Color getPieceColor(int x, int y) {
		if ( ! isOnBoard(x, y)) return null;
		else return board[x][y].getColor();
	}
	
	public boolean isOnBoard(int x, int y) {
		return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
	}
	
}
