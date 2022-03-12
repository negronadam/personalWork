package DecisionStructures;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		while (num != -1)
		{
			System.out.println("Please enter a number to cube! (-1 will end the program)");
			num = input.nextInt();
			double cubedNumber = Math.pow(num, 3);
			if (num != -1)
			{
				System.out.println("Your cubed number is: " + cubedNumber);
			}
		}

	}

}
