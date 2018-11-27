package Strings;
import java.util.Scanner;
public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Example:
		String test1 = "Bob";
		String test2 = "Bill";
		System.out.println(test1.indexOf("b"));
		*/
		String test1 = "test";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		test1 = input.nextLine();
		System.out.println("The letter X appears in your string at: " + test1.indexOf("x") + " letters down");
		
		
	}

}
