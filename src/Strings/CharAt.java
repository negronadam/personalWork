package Strings;
import java.util.Scanner;
public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sentance = "Sentance";
		System.out.println("Write a sentance");
		sentance = input.nextLine();
		System.out.println(sentance.charAt(0));
		System.out.println(sentance.charAt(2));
		System.out.println(sentance);
		
	}

}
