import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Game {

	public Game() {
		startGame();
	}

	private void startGame() {
		Board board = new Board();
		PieceColor pieceColor = PieceColor.WHITE;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println(pieceColor + "'s turn: ");
			String line = null;
			try {
				line = reader.readLine();
			} catch (IOException e) {}

			if (line == null || line.length() == 0) {
				break;
			}
			String[] fromTo = line.split("-");
			if (fromTo.length != 2) {
				System.out.println("Illegal syntax, use from-to, e.g. d2-d4");
				continue;
			}
			String from = fromTo[0].trim(), to = fromTo[1].trim();
			
			if (board.movePiece(pieceColor, from, to)) {
				pieceColor = pieceColor.getOtherColor();
				for (PieceColor kingColor: PieceColor.values()) {
					if (board.isCheck(kingColor)) {
						System.out.println("The " + kingColor + " king is check!");
					}
				}
			}
			
		} while (board.findKing(PieceColor.WHITE) != null &&
				board.findKing(PieceColor.BLACK) != null);

	}

	public static void main(String[] args) {
		new Game();
	}
}
