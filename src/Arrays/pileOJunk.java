package Arrays;
import java.util.Random;
public class pileOJunk {
	Random generator = new Random();
	public static int idNumber = 1100;
	private static int randomNum;
	public pileOJunk()
	{
		randomNum = 10 + generator.nextInt(100 - 10 + 1);
	}
	
	public static int sumOfNums(int xNum1, int xNum2)
	{
		return xNum1 + xNum2;
	}
	
	public static int getRandomNumber()
	{
		return randomNum;
	}
	
	public int overwriteRandomNum(int xRandom)
	{
		randomNum = xRandom;
		return randomNum;
	}
}
