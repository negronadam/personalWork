package Strings;
import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test1 = "test";
		/*
		System.out.println("Please enter a string");
		test1 = input.nextLine();
		System.out.println("The string is " + test1.length() + " characters long");
		*/
		System.out.println("Please type a sentance");
		test1 = input.nextLine();
		for(char index = 0; index < test1.length(); index++)
		{
			System.out.println(test1.charAt(index));
		}
	}

}
