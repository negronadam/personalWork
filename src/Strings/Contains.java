package Strings;
import java.util.Scanner;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test = "test";
		System.out.println("Please enter a string");
		test = input.nextLine();
		System.out.println(test.contains("s"));
	}

}
