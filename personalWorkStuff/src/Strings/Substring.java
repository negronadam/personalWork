package Strings;
import java.util.Scanner;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test1 = "test";
		System.out.println("Please enter a sentance");
		test1 = input.nextLine();
		System.out.println(test1.substring(2));
		System.out.println("Please enter another sentance");
		test1 = input.nextLine();
		System.out.println(test1.substring(5, test1.length()));
	}

}
