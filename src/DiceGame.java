import javax.swing.JOptionPane;
import java.util.Scanner;


public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner input = new Scanner (System.in);
			
			DiceGameObjects classObject = new DiceGameObjects();
			
			int playAgain, roll, userInput, gameCount=1;
			String userChoice = null;
			double win =0, evenWin=0, oddWin=0;
			double evenGuess=0, oddDice = 0;
			
			String name = JOptionPane.showInputDialog("Please enter name: ");
			
			classObject.setName(name);
			
			String welcomeMessage = String.format("Hi %s! Welcome to the Dice Game.\nGuess if the dice will be odd or even.\n", classObject.getName());
			JOptionPane.showMessageDialog(null, welcomeMessage);
			
			do
			{
				int diceNum = classObject.getDiceNum();
				
				gameCount++;
				classObject.setGameCount(gameCount);
				
				userInput = Integer.parseInt(JOptionPane.showInputDialog("\nPress 1 for odd or 2 for even: "));
				
				
				if (userInput ==1) userChoice="Odd";
				if (userInput ==2) userChoice="Even";
				
				JOptionPane.showMessageDialog(null,"You chose "+ userChoice);
				
				roll = Integer.parseInt(JOptionPane.showInputDialog("\n\nPress 1 to role the dice: "));
				
				JOptionPane.showMessageDialog(null,"Dice number is "+ diceNum);
				
				if (userInput ==1)
				{
					if (diceNum == 1 || diceNum==3 || diceNum ==5)
					{
						JOptionPane.showMessageDialog(null,"Congratulations! You guessed it.\nThe dice rolled an odd number.");
						win++; oddWin++; oddDice++;
						classObject.setWin(win); classObject.setOddWin(oddWin); classObject.setOddDice(oddDice);
					}
					else
						JOptionPane.showMessageDialog(null,"Sorry, you lose.\nThe dice rolled an even number.");
				}
				else if (userInput ==2)
				{	
					evenGuess++;
					classObject.setEvenGuess(evenGuess);
					if (diceNum == 2 || diceNum ==4 || diceNum == 6)
					{
						JOptionPane.showMessageDialog(null,"Yes!! You did it. The dice rolled an even number.");
						win++; evenWin++;
						classObject.setWin(win); classObject.setEvenWin(evenWin);
					}
					else
					{	
						JOptionPane.showMessageDialog(null,"Sorry, you lose! this time its a  odd number.");
						oddDice++;
						classObject.setOddDice(oddDice++);
					}
				}
				
				playAgain = Integer.parseInt(JOptionPane.showInputDialog("\n\nPress 0 to play again or 1 to exit"));
				
			}
			while (playAgain ==  1);
				
				JOptionPane.showMessageDialog(null,"-- Game Stats --\n\nGames won: "+ classObject.getWin() + 
						"\nGame played: "+ classObject.getGameCount() + "\nWinning percentage: "+ classObject.getWinPercent()+
						"\n% player chose even: "+ classObject.getEvenGuessPercent()+
						"\n% dice rolled an odd number: "+ classObject.getOddDicePercent()+
						"\n# of times player won when choosing even: "+ classObject.getEvenWin()+
						"\n# of times player won when choosing odd: "+ classObject.getOddWin()); 
						
				JOptionPane.showMessageDialog(null,"Come back soon!.");
		}


	}

