package Strings;
import java.util.Scanner;
public class StringAssessmentPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test = "Test";
		int wordCount = 0;
		System.out.println("Please enter a sentence");
		test = input.nextLine();
		for(int i = 0; i < test.length(); i++)
		{
			if (test.charAt(i) == ' ')
			{
				wordCount++;
			}
		}
		
		System.out.println("There are " + (wordCount + 1) + " words in your sentence!");
	}

}
