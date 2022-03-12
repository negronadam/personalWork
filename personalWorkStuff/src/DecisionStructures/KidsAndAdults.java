package DecisionStructures;
import java.util.Scanner;
public class KidsAndAdults {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 999;
		double height = 999.99;
		double weight = 999.99;
		double luckyNumber = 999.00;
		System.out.println("How old are you?");
		age = input.nextInt();
		if (age <= 18)
		{
			System.out.println("How much do you weigh?");
			weight = input.nextDouble();
			luckyNumber = (weight/2);
			System.out.println("Your lucky number is: " + luckyNumber);
		}
		else
		{
			System.out.println("What is your height in inches?");
			height = input.nextDouble();
			luckyNumber = (height*5);
			System.out.println("Your Lucky Number is: " + luckyNumber);
		}

	}

}
