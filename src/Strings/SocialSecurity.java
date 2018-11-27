package Strings;
import java.util.Scanner;
public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String social = "test";
		System.out.println("Please enter your social security number");
		social = input.nextLine();
		System.out.println("Your social security number brokendown line by line is:");
		System.out.println(social.substring(0,3));
		System.out.println(social.substring(3,5));
		System.out.println(social.substring(5,9));
	}

}
