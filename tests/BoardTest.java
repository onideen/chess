import static org.junit.Assert.*;

import org.junit.Test;


public class BoardTest {

	@Test
	public void newBoardHasEmptyCells(){
		Board board = new Board();
		
		assertNull(board.getPieceAt(4,4));
	}
	
}
