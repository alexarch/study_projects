// // наследование + конструктор
public class TwoPlayerGame extends Game {
	
	private String player1Name;
	private String player2Name;
	
	public TwoPlayerGame(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;		
	}
	
	public void printPlayer1Name() {
		System.out.println(this.player1Name);		
	}
	
	public void printPlayer2Name() {
		System.out.println(this.player2Name);		
	}

}
