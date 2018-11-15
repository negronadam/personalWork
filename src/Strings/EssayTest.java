package Strings;
import java.util.Scanner;
public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Essay essay = new Essay();
		String firstName = "test";
		String lastName = "test";
		String essayText = "text";
		System.out.println("Please enter your first name");
		firstName = input.nextLine();
		System.out.println("Please enter your last name");
		lastName = input.nextLine();
		essay.setAuthorsName(firstName, lastName);
		System.out.println("The Author's name is:");
		System.out.println(essay.getFirstName() + essay.getLastName());
		System.out.println("Please type your essay");
		essayText = input.nextLine();
		essay.setText(essayText);
		System.out.println("Your Name in all Caps is: " + essay.getLastNameCaps());
		System.out.println("The number of characters in your first name is: " + essay.getFirstNameLength());
		System.out.println("Does your name contain the letter X?" + essay.findLetterX());
		System.out.println("The number of words in your essay is: " + essay.getWordCount());
		
		
	}

}
