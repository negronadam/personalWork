package DecisionStructures;
import java.util.Scanner;
public class NewCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner("System.in");
		// TODO Auto-generated method stub
		
		System.out.println("What would you like to do?");
		
		int choice = input.nextInt();
		
		
		while(choice == 0)
		{
			while(choice == 1)
			{
				System.out.println("You chose Right Triangle!");
			}
			
			while (choice == 2)
			{
				System.out.println("You have chosen Powers!");
			}
		}
	}

}
