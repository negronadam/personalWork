package Strings;
import java.util.Scanner;
public class StringsStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 999;
		String name = "PlaceHolder";
		System.out.println("Please enter your age");
		age = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your name");
		name = input.next();
		System.out.println("Your age is: " + age);
		System.out.println("Your name is: " + name);
	}

}
