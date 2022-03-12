package inputExamples;
import java.util.Scanner;
public class LockerCombonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstDigits;
		int nextDigits;
		int lastDigits;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the first 2 digits of your locker combonation");
		firstDigits = input.nextInt();
		System.out.println("Please input the next 2 digits of your locker combonation");
		nextDigits = input.nextInt();
		System.out.println("Please input the last 2 digits of your locker combonation");
		lastDigits = input.nextInt();
		System.out.println("Your locker combo is: " + firstDigits + "-" + nextDigits + "-" + lastDigits);
	}

}
