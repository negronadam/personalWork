package DecisionStructures;
import java.util.Scanner;
public class MoreLoopStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter  = 0;
		int favoriteNum = 0;
		int total = 0;
		/*
		System.out.println("How many hellos would you like?");
		counter = input.nextInt();
		
		if(counter >= 0)
		{
			for(counter = counter; counter >= 1; counter = counter - 1)
			{
				System.out.println(counter + " Hello!");
			}
			System.out.println("Done!");
		}
		
		else
		{
			System.out.println("Please enter a positive integer.");
		}
		/*
		/*System.out.println("How many numbers would you like to print?");
		counter = input.nextInt();
		System.out.println("What is your favorite number?");
		favoriteNum = input.nextInt();
		for (counter = counter; counter >= 1;)
		{
			System.out.println(favoriteNum + "Hello");
		}
		*/
		
		for (counter = 1; counter <= 5; counter = counter + 1)
		{
			System.out.println("What is your favorite number?");
			int num = input.nextInt();
			total += num;
		}
		
		System.out.println("Total: " + total);
		
		input.close();
	}

}
