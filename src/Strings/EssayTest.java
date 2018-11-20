package Strings;
import java.util.Scanner;
public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Essay essay = new Essay();
		System.out.println("Please enter your essay");
		String essayText = input.nextLine();
		essay.setText(essayText);
		System.out.println("The number of words in your essay is: " + essay.getWordCount());
		
		
	}

}
