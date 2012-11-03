import java.math.*;

public class King extends AbstractPiece {

  public King(PieceColor color){
		super(color);
	}
	
	@Override
	public String toString() {
		if (this.getPieceColor()==PieceColor.BLACK) {
			return "K";
		}
		else {
			return "k";
		}
	}
	@Override
	public boolean canMove(String from, String to, Board board) {
		return (Board.isDiagonal(from, to) || Board.isStraight(from, to))
		&&(Math.abs(Board.getColumnDistance(from, to))<=1
				&&Math.abs(Board.getRowDistance(from, to))<=1 );
	}

}
