package DecisionStructures;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int option = 0;
		System.out.println("Welcome to the calculator!");
		System.out.println("1. Is It ARight Triangle");
		System.out.println("2. Power");
		System.out.println("3. Square Root");
		System.out.println("4. Round Up");
		System.out.println("5. Round Down");
		System.out.println("6. Quit");
		option = input.nextInt();
		switch(option)
		{
			case 1:
				
				System.out.println("You have chosen Is It A Right Triangle!");
				System.out.println("What are the angles of the triangle?");
				System.out.println("Angle 1: ");
				double angle1 = input.nextDouble();
				System.out.println("Angle 2: ");
				double angle2 = input.nextDouble();
				System.out.println("Angle 3: ");
				double angle3 = input.nextDouble();
				if(angle1 != 90 || angle2 != 90 || angle3 != 90)
				{
					System.out.println("It is not a triangle");
				}
				else
				{
					System.out.println("That is a triangle!");
				}
			break;
			
			case 2:
				
			break;
			
			case 3:
				
			break;
				
			case 4:
				
			break;
				
			case 5:
				
			break;
				
			case 6:
				
			break;
		}
	}

}
