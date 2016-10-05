


public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop = 0;
		do{
		Display.Print();//Greet Players, Ask to what score to play, set number of rounds
		Display.PrintHeader();//Print a header text before entering loop
		do
		{
		Display.PrintGame();//print score, round, and tell player to go
		Player p = new Player();//create new player object, get there choice, get computer choice
		Utility.Decision();//see who wins
		}while (Player.getPlayerPoints()< Display.getRounds() && Player.getCompPoints() < Display.getRounds());
		loop = Utility.Winner();//ask if they want to play again
		Player.setCompBegin();//reset computers score to 0
		Player.setPlayBegin();//reset players score to 0
		Display.setCounter();//reset score to play to
		}while (loop ==1);
		Display.GoodBye();
	}

}
