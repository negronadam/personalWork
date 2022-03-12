package DecisionStructures;
import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Please enter an integer to subject to Prime Factorization.");
		num = input.nextInt();
		for (int factor = 1; factor <= num; factor++)
		{
			int remainder = num%factor;
			if (remainder == 0)
			{
				System.out.println("The number is a primenumber");
			}
			else
			{
				System.out.println("The number is not prime.");
			}
		}

	}

}
