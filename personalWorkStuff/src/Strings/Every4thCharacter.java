package Strings;
import java.util.Scanner;
public class Every4thCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sentence = "test";
		System.out.println("Please enter a sentence");
		sentence = input.nextLine();
		for(int i = 0; i < sentence.length(); i += 4)
		{
			System.out.println(sentence.charAt(i));
		}
		
	}

}
