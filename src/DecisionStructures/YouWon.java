package DecisionStructures;
import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money = -999.0;
		double epsilon = 0.01;
		System.out.println("How much money did you recieve for your fifth birthday?");
		money = input.nextDouble();
		if (Math.abs(money-Math.sqrt(84.3)) < epsilon)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Your family tree = LGBT");
		}

	}

}
