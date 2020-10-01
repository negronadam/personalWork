package inputExamples;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit1;
		int digit2;
		int digit3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first digit");
			digit1 = input.nextInt();
		System.out.println("Please enter your second digit");
			digit2 = input.nextInt();
		System.out.println("Please enter your third digit");
			digit3 = input.nextInt();
			System.out.println("Combonation 1: " + digit1 + digit2 + digit3);
			System.out.println("Combonation 2: " + digit2 + digit1 + digit3);
			System.out.println("Combonation 3: " + digit3 + digit1 + digit2);
			System.out.println("Combonation 4: " + digit1 + digit3 + digit2);
			System.out.println("Combonation 5: " + digit2 + digit3 + digit1);
			System.out.println("Combonation 6: " + digit3 + digit2 + digit1);
	}

}
