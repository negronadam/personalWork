package Strings;
import java.util.Scanner;
public class TakeAwayLetterA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test = "Test";
		System.out.println("Please enter a sentence.");
		test = input.nextLine();
		for(int i = 0; i < test.length(); i++)
		{
			if(test.charAt(i) == 'a' || test.charAt(i) == 'A' || test.charAt(i) == ' ')
			{
				System.out.println("");
			}
		}
	}

}
