
public class Utility {
	
	private static double choice;
	private static double CompChoice;
	private static String decision;
	private static double playerPoints=0;
	private static double compPoints=0;
	private static int point = 1;
	
	public Utility()
	{
		choice = Conversion(Game.getchoice());//get  their choice, convert it to double
		CompChoice = Game.getcomChoice();//get computers choice
	}
	public static double Conversion(double d)//method that converts players choice to a double
	{
		double Choice = d;
		return Choice;
	}
	public static int Winner()//determine if the player won based on their double converted choice and the computers random choice
	{
		if(Player.getPlayerPoints() == Display.getRounds())
		{
			Display.YouWin();
			int loop = InputClass.Repeat();//ask if they want to play again
			return loop;
		}
		else 
		{
			Display.YouLose();
			int loop = InputClass.Repeat();//ask if they want to play again
			return loop;
		}
	}
	public static double PlayerAnswerToDouble(String response)
	{
		double resp=0;
		
		if(response.equals("rock"))
		{
			resp = 1;
			return resp;
		}
		else if (response.equals("paper"))
		{
			resp = 2;
			return resp;
		}
		else if (response.equals("scissors"))
		{
			resp = 3;
			return resp;
		}
		else
		{
			System.out.println("Invalid choice. Please try again");
			return resp;
		}
	}
	public static void Decision()
	{
		if (choice == 1)
		{
			if (CompChoice == 1)
			{
				System.out.println("The Computer chose Rock");
				System.out.println("Tie");
			}
			else if (CompChoice == 2)
			{
				System.out.println("The Computer chose Paper");
				System.out.println("You Lose");
				Player.setCompPoints(point);
			}
			else 
			{
				System.out.println("The Computer chose Scissors");
				System.out.println("You Win");
				Player.setPlayerPoints(point);
			}
		}
			else if(choice ==2)
				{
				if (CompChoice == 1)
				{
					System.out.println("The Computer chose Rock");
					System.out.println("You Win");
					Player.setPlayerPoints(point);
				}
				else if (CompChoice == 2)
				{
					System.out.println("The Computer chose Paper");
					System.out.println("Tie");
				}
				else 
				{
					System.out.println("The Computer chose Scissors");
					System.out.println("You Lose");
					Player.setCompPoints(point);
				}
				}
			else
				{
				if (CompChoice == 1)
				{
					System.out.println("The Computer chose Rock");
					System.out.println("You Lose");
					Player.setCompPoints(point);
				}
				else if (CompChoice == 2)
				{
					System.out.println("The Computer chose Paper");
					System.out.println("You Win");
					Player.setPlayerPoints(point);
				}
				else 
				{
					System.out.println("The Computer chose Scissors");
					System.out.println("Tie");
				}
		}
	}
}
		
		
	
		
		
	
		
	


