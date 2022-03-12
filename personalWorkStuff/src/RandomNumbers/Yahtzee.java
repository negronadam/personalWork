package RandomNumbers;
import java.util.Scanner;
import java.util.Random;
public class Yahtzee {
	Scanner input = new Scanner(System.in);
	Random generator = new Random();
	private int diceNum;
	private int min;
	private int max;
	public Yahtzee()
	{
		diceNum = 0;
		min = 1;
		max = 6;
	}
	
	public int rollDice()
	{
		int randomNum = (min + generator.nextInt(max - min + 1));
		return randomNum;
	}
	
}
