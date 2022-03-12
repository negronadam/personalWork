package Strings;
import java.util.Scanner;
public class AlphabeticOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test1 = "Test1";
		String test2 = "Test2";
		System.out.println("Please enter the first name");
		test1 = input.nextLine();
		System.out.println("Please enter the next name");
		test2 = input.nextLine();
		System.out.println("The names in all upper case is: " + test1.toUpperCase() + " And " + test2.toUpperCase());
		if(test1.compareToIgnoreCase(test2) < 0)
		{
			System.out.println("The names that appears first in alphabetical order is: " + test1.toUpperCase());
		}
		else
		{
			System.out.println("The name that appears first in alphabetical order is: " + test2.toUpperCase());
		}
	}

}
