import java.util.Scanner;
import java.*;
import java.io.*;



public class InputClass {
	
	private static String guess;
	private static double choice;
	private static String compChoice;
	private static String response;
	public int counter = 2;

	public static double Begin()
	{
		do
		{
	Scanner scan1 = new Scanner(System.in);
	response = scan1.next();
	String newResponse = response.toLowerCase();
	choice = Utility.PlayerAnswerToDouble(newResponse);
		}while (choice == 0);
	return choice;
	}
	public static int Repeat()
	{
		System.out.println("Press 1 and hit ENTER key to play again");
		Scanner scan2 = new Scanner(System.in);
		String repeat = scan2.next();
		int looper = Integer.parseInt(repeat);
		return looper;	
	}
			
		
	
	
	
	
	

}
