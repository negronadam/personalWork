package mathOperators;
import java.util.Scanner;
public class phoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int areaCode = 999;
		int middleDigits = 999;
		int lastDigits = 999;
		long phoneNumber = 999;
		System.out.println("Please enter your phone number");
		phoneNumber = input.nextLong();
		System.out.println("Your phone number is: " + phoneNumber);
		input.close();
	}

}
