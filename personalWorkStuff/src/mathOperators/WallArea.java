package mathOperators;

import java.util.Scanner;
import java.lang.Object;
import java.lang.Math;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
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
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numerator");
		double numerator = input.nextDouble();
		System.out.println("Enter the denominator");
		double denominator = input.nextDouble();
		System.out.println((numerator*3)/(Math.abs(denominator*3)));
	}

}
