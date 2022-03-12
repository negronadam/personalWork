package DesigningClasses;
import java.util.Scanner;
import java.awt.GraphicsEnvironment;
import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
public class Task4Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 *This is the MonarchLink software developed by Adam Negron
		 *The whole point of this program is to take Monarchs with various variables tied to ranking and the such. 
		 *The equation to calculate this is as such (The higher the score the better):
		 *
		 *MARK PROJECT AS NEXT TO FINISH
		 */
		Scanner input = new Scanner(System.in);
		boolean programIsRunning = true;
		ArrayList<Monarch> monarchs = new ArrayList<Monarch>();
		monarchs.add(new Monarch("King Henry VIII", 0, 0));
		monarchs.add(new Monarch("King Philip II", 0, 0));
		monarchs.add(new Monarch("King Louis XIV", 10, 9));
		monarchs.add(new Monarch("Maria Theresa", 0, 0));
		monarchs.add(new Monarch("King Frederick the Great", 5, 5));
		monarchs.add(new Monarch("Tsar Ivan the Terrible", 0, 0));
		monarchs.add(new Monarch("King Peter the Great", 0, 0));
		while(programIsRunning)
		{
			
		String Username = "mrozj";
		String Password = "Task4Project";
		System.out.println("Initializing MonarchLink Software...");
		System.out.println("Validating Current Data... Update Availible!");
		System.out.println("Authentification required to view contents of Database... Please enter your credentials.");
		String user = input.nextLine();
		System.out.println("Please enter your password...");
		String pass = input.nextLine();
		if(Username.equals(user))
		{
			System.out.println("Username is good! Checking password...");
			if(Password.equals(pass))
			{
				System.out.println("Password is good! User Authenticated. Entering Database...");
				boolean authentValid = true;
				while(authentValid)
				{
					System.out.println("You have the choice of several Monarchs...");
					System.out.println("Type the number of which monarch you would like to investigate.");
					System.out.println("1. King Henry VIII");
					System.out.println("2. King Philip II");
					System.out.println("3. King Louis XIV");
					System.out.println("4. Maria Theresa");
					System.out.println("5. Frederick the Great");
					System.out.println("6. Ivan the Terrible");
					System.out.println("7. Peter the Great");
					System.out.println("If you would like to see who Adam Negron would consider to be the most absolute ruler after reading the above profiles please enter 8");
					int menuChoice = input.nextInt();
					switch(menuChoice)
					{
						case 1:
							System.out.println("King Henry VIII is a good contender as well. The man straight up challenged the church");
							System.out.println("By establishing the Church of England to get rid of the Catholic's control of him and his divorce");
							System.out.println("From Catherine of Aragon.");
							
							
							break;
							
						case 2:
							
							break;
							
						case 3:
							System.out.println("King Louis XIV was super controlling");
							System.out.println("He ranks very highly because he left little freedoms for few.");
							System.out.println("He was kept away from power causing this super power hungry reign");
							System.out.println("He ranks crazy high. I would say 10/10 in terms of ruling and a 9/10 in terms of army.");
							
							break;
							
						case 4:
							
							break;
							
						case 5:
							System.out.println("Frederick The Great was the absolute monarch in Prussia.");
							System.out.println("He would not rank very high on my scale of absolutism simply");
							System.out.println("because he was a very leniant leader as opposed to other leaders");
							System.out.println("Especially Religiously, tolerating all faiths in his land.");
							System.out.println("It would also seem that he did not really care for the art of war");
							System.out.println("Focusing on finer things in life.");
							break;
							
							
						case 6:
							
							
							break;
							
						case 7:
							
							break;
							
						default: System.out.println("Please enter a valid number 1-7...");
							
							break;
					}
				}
			}
		}
	 }
	}

}
