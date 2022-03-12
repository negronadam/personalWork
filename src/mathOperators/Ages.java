package mathOperators;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int friendOne;
		int friendTwo;
		int friendThree;
		int sumOfAges;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the age of your first friend");
		friendOne = input.nextInt();
		System.out.println("Please enter the age of your second friend");
		friendTwo = input.nextInt();
		System.out.println("Please enter the age of your third friend");
		friendThree = input.nextInt();
		sumOfAges = friendOne + friendTwo + friendThree;
		System.out.println("The combined age of all 3 friends is: " + sumOfAges);
	}

}
