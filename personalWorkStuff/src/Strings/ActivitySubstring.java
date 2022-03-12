package Strings;
import java.util.Scanner;
public class ActivitySubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String text = "My name is Buzz Lightyear!";
		System.out.println("Please enter your name to see something cool.");
		text = input.nextLine();
		for (int i = 0; i < text.length(); i++)
		{
			System.out.println(text.substring(i));
		}
	}

}
