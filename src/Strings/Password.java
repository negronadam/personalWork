package Strings;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password = "12345Password";
		String testPassword = "Test";
		int loop = 0;
		while(loop == 0)
		{
			System.out.println("Please enter a password");
			testPassword = input.nextLine();
			if (testPassword.equals(password));
			{
				System.out.println("That password was correct!");
				loop = 1;
			}
			
			
		}
		
	}

}
