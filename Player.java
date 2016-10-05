
public class Player {
	private static int playerPoints=0;
	private static int compPoints=0;

	public Player()
	{
		Game g = new Game();
		Utility u = new Utility();
		playerPoints = playerPoints;
		compPoints = compPoints;
	}
	public static  void setPlayerPoints(int playpts)
	{
		playerPoints = playerPoints+playpts;
		
	}
	public static void setCompPoints(int compPnts)
	{
		compPoints = compPoints + compPnts;
	}
	public static void setCompBegin()
	{
		compPoints = 0;
	}
	public static void setPlayBegin()
	{
		playerPoints = 0;
	}
	public static  int getPlayerPoints()
	{
		return playerPoints;
		
	}
	public static int getCompPoints()
	{
		return compPoints;
	}
}
