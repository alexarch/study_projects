// // наследование + конструктор
public class ThreePlayerGame extends TwoPlayerGame {
	
	private String player3Name;
	
	public ThreePlayerGame(String player1Name, String player2Name, String player3Name) {
		super(player1Name, player2Name);
		this.player3Name = player3Name;
	}
	
	public void printPlayer3Name() {
		System.out.println(this.player3Name);		
	}

}
