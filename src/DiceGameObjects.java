
public class DiceGameObjects {

	private String name;
	private double win=0, evenWin = 0, oddWin = 0;
	private double evenGuess = 0, oddDice=0;
	public int gameCount = 0;
	
	public void setName (String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setGameCount (int gameCount)
	{
		this.gameCount = gameCount;
	}
	
	public void setWin (double win)
	{
		this.win = win;
	}
	public void setEvenWin (double evenWin)
	{
		this.evenWin = evenWin;
	}
	public void setOddWin (double oddWin)	
	{
		this.oddWin = oddWin;
	}
	public void setEvenGuess (double evenGuess)
	{
		this.evenGuess = evenGuess;
	}
	public void setOddDice (double oddDice)
	{
		this.oddDice = oddDice;
	}
	public double getWin()
	{
		return win;
	}
	public double getOddWin()
	{
		return oddWin;
	}
	public double getWinPercent()
	{
		double winPercent = (win/(double)(gameCount-1))*100;
		return winPercent;
	}
	public double getEvenWin()
	{
		return evenWin;
	}
	public double getEvenGuessPercent()
	{
		double evenGuessPercent = (evenGuess/(double)(gameCount-1))*100;
		return evenGuessPercent;
	}
	public double getOddDicePercent()
	{
		double oddDicePercent = (oddDice/(double)(gameCount-1))*100;
		return oddDicePercent;
	}
	
	public int getDiceNum()
	{
		int randomNum = 1 + (int)(Math.random()*6);
		return randomNum;
	}
	public int getGameCount()
	{
		return gameCount-1;
	}

}

//// Please explain how public class DiceGameObjects is used...also, you're missing the Constructor
