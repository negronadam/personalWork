package Arrays;
import java.util.Random;
public class pileOJunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pileOJunk pile = new pileOJunk();
		Random generator = new Random();
		System.out.println(pile.sumOfNums(1,4));
		System.out.println("The current random number is: " + pile.getRandomNumber());
		pile.overwriteRandomNum(1 + generator.nextInt(50 - 1 + 1));
		System.out.println("The newest random number is: " + pile.getRandomNumber());
	}

}
