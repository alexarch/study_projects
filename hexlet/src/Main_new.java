// наследование + конструктор
public class Main_new {

	public static void main(String[] args) {
		
		Game game = new Game();
		Board board = new Board();
		
		game.printGameName();
		
		TwoPlayerGame twoPlayerGame = new TwoPlayerGame("Frank", "Bob");
		twoPlayerGame.printPlayer1Name();
		twoPlayerGame.printPlayer2Name();
		twoPlayerGame.printGameName();
		
		ThreePlayerGame threePlayerGame = new ThreePlayerGame("Frank", "Bob", "Joe");
		threePlayerGame.printPlayer1Name();
		threePlayerGame.printPlayer2Name();
		threePlayerGame.printPlayer3Name();
		threePlayerGame.printGameName();
		
		printGameNameAndBoard(game, board); 
		printGameNameAndBoard(twoPlayerGame, board); // наследование из game
		printGameNameAndBoard(threePlayerGame, board); // наследование из game
		
	}
	
	private static void printGameNameAndBoard(Game game, Board board) {
		System.out.println("==========");
		game.printGameName();
		board.printBoard();
	}

}
