package Strings;
import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test1 = "Test";
		System.out.println("Please enter a string");
		test1 = input.nextLine();
		System.out.println("The string is " + test1.length() + " characters long");
	}

}
