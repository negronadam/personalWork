package mathOperators;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baseLength;
		int heightLength;
		int area;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of the base of the wall");
		baseLength = input.nextInt();
		System.out.println("Please enter the height of the wall.");
		heightLength = input.nextInt();
		area = baseLength * heightLength;
		System.out.println("The area of the wall is: " + area);
	}

}
