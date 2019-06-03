package OtherPrograms;
import java.util.Scanner;
public class ConsolePanelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameIsRunning = true;
		Scanner input = new Scanner(System.in);
		while(gameIsRunning)
		{
			if(!gameIsRunning)
			{
				System.err.println("Error! Game could not start!");
				break;
			}
			
			System.out.println("Welcome to ConsolePanel!");
			System.out.println("Job description: You are a new hire at IronNuclear Industries!");
			System.out.println("Your job here is to make sure nothing goes haywire. This includes the following: ");
			System.out.println("1. Making sure the Nuclear Reactor doesn't over heat.");
			System.out.println("2. Watching out for incoming cyber attacks on the reactor.");
			System.out.println("3. Testing the Reactor's systems regularly to ensure that everything is going alright.");
			System.out.println("4. Selecting failed systems for repair.");
			System.out.println("Do you accept these terms and become our new Nuclear Reactor Operator? y/n");
			String choice = input.nextLine();
			if(choice.equals("y"))
			{
				System.out.println("Welcome to IronNuclear's Model Theta Reactor as an Operator!");
				System.out.println("Please enter a command: ");
			}
			else if(choice.equals("n"))
			{
				System.out.println("Thank you for your application. Have a nice day!");
				input.nextLine();
			}
		}
	}

}
