package Strings;
import java.util.Scanner;
public class ActivityToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test1 = "test";
		System.out.println("Please type in a sentance.");
		test1 = input.nextLine();
		System.out.println(test1.toLowerCase());
		System.out.println(test1);
		input.close();
	}

}
