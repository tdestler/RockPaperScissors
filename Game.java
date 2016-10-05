
public class Game {
	
	private static double choice;
	private static double comChoice;
	private static int playerPoints;
	private static int compPoints;
	//private static int round = 0;
	
	public Game()
	{
		choice = InputClass.Begin();
		comChoice =Math.floor((Math.random()*3)+1);
		//round = 0;
	}
	public static double getchoice(){
		return choice;
	}
	public static double getcomChoice(){
		return comChoice;
	}
	
	/*public static int getRound()
	{
		return round;
	}
	public static void setRound(int intRound)
	{
		round = intRound + 1;
	}*/
}
