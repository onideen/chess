package game;

public class BoardIterator extends ArrayIterator {

	private static String[] positions; 

	public BoardIterator() {
		super(computePositions());
	}

	private static String[] computePositions() {
		if (positions == null) {
			
			positions = new String[64];
			int pos = 0;
			for (char column = 'a'; column <= 'h'; column++) {
				for (char row = '1'; row <= '8'; row++) {
					positions[pos++] = String.valueOf(column)+ String.valueOf(row);
				}
			}
		}
		return positions;
	}

}
