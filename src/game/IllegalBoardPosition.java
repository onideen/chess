package game;

public class IllegalBoardPosition extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5682296939034872527L;
	
	private String position;
	
	public IllegalBoardPosition(String position) {
		super(position + " is an illegal chess board position.");
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
}
