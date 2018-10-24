package DecisionStructures;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		/*
		do
		{
			System.out.println("The magic number is: " + (num * 17) + "!");
			System.out.println("Please enter a number! Hint: Enter 9999 to escape purgatory.");
			num = input.nextInt();
		}while(num != 9999);
		*/
		
		do
		{
			
			System.out.println("Enter your number");
			num = input.nextInt();
			
		}while(num != 9999);
	}

}
