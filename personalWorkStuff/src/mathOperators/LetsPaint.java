package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Testing source control!
		int lengthInFeet;
		int widthInFeet;
		int sFPG = 150;
		int area;
		int gallonsNeeded;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of the room in feet");
		lengthInFeet = input.nextInt();
		System.out.println("Please enter the width of the room in feet");
		widthInFeet = input.nextInt();
		System.out.println("The dimensions of the room is: " + lengthInFeet + "ft" + " by " + widthInFeet + "ft");
		area = lengthInFeet * widthInFeet;
		System.out.println("The amount of wall that still needs to be painted is: " + area + "Sqft");
		gallonsNeeded = area / sFPG;
		System.out.println("You will also need" + gallonsNeeded + "gallons of paint.");
		input.close();
		
	}

}
