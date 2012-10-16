
public class Board {
	
	private Piece[][] board;
	
	public boolean isEmpty(int x, int y){
		return board[x][y] == null;
	}
	
}
