import java.util.Scanner;

public class Display {
	static int rounds = 10;
	static int counter=1;
	static int count =2;
	
	public static void Print()
	{
		System.out.println("Rock Paper Scissors");
		do{
			System.out.println("What Score Do You Want To Play To?");
			Scanner scan3 = new Scanner(System.in);
			try{
			rounds = Integer.parseInt(scan3.next());
			count = 2;}
			catch(Exception ex){
				System.out.println("You have entered an invalid value.  Please choose a number.");
				count = 1;
				}
			}while (count == 1);
	}
	
	public static void PrintHeader()
	{
		System.out.println("Rock Paper Scissors First Player to " + rounds + " Wins");
	}
	public static void PrintGame()
	{
		System.out.println("Computer Score = " + Player.getCompPoints() + "\tYour Score = " + Player.getPlayerPoints());
		System.out.println("Round " + counter);
		System.out.println("Enter Rock Paper or Scissors and Press ENTER");
		counter++;
	}
	public static void YouWin()
	{
		System.out.println("Congratulations. You Win");
		System.out.println("Do you want to play again");
	}
	public static void YouLose()
	{
		System.out.println("You Lose");
		System.out.println("Do you want to play again");
	}
	public static void GoodBye()
	{
		System.out.println("Thank you. Good Bye");
	}
	public static int getRounds()
	{
		return rounds;
	}
	public static void setCounter()
	{
		counter = 1;
	}

}
