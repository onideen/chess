package pieces;
import game.Board;
import game.PieceColor;


public class Queen extends AbstractPiece {

	public Queen(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove(String from, String to, Board board) {
		return (Board.isDiagonal(from, to) || Board.isStraight(from, to)) && ( ! board.isOccupiedBetween(from, to));
	}

	
	@Override
	public String toString() {
		return getPieceColor() == PieceColor.WHITE ? "Q" : "q";
	}	
}
