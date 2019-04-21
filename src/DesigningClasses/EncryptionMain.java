package DesigningClasses;
import java.util.ArrayList;
import java.util.Scanner;
public class EncryptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> encrypt = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		boolean programIsRunning = true;
		System.out.println("Menu:");
		System.out.println("1. Interactive Menu Demo");
		System.out.println("2. Encrypter");
		int menuChoice = input.nextInt();
		switch(menuChoice)
			{
				case 1:
					while(programIsRunning)
					{
					switch(mPos)
					{
					case 1:
						System.out.println(">>" + " Test1");
						break;
						System.out.println("Test2");
						System.out.println("Test3");
					}
						boolean menuChoosing = true;
						int mpos = 0;
						while(menuChoosing)
						{
							char move = input.next().charAt(0);
							if(move == 'w')
							{
								mpos++;
							}
							if(move == 's')
							{
								mpos--;
							}
							
						}
					}
			
					break;
					
				case 2:
					System.out.println("Welcome to Adam Negron's Encrypter!");
					System.out.println("Please enter a phrase to be encrypted.");
					String phrase = input.nextLine();
					for(int a = 0; a < phrase.length(); a++)
					{
						if(phrase.charAt(a) == 'a')
						{
							encrypt.add(10);
						}
						if(phrase.charAt(a) == 'b')
						{
							encrypt.add(31);
						}
						if(phrase.charAt(a) == 'c')
						{
							encrypt.add(17);
						}
						if(phrase.charAt(a) == 'd')
						{
							
						}
						if(phrase.charAt(a) == 'e')
						{
							
						}
						if(phrase.charAt(a) == 'f')
						{
							
						}
						if(phrase.charAt(a) == 'g')
						{
							
						}
						if(phrase.charAt(a) == 'h')
						{
							
						}
						if(phrase.charAt(a) == 'i')
						{
							
						}
						if(phrase.charAt(a) == 'j')
						{
							
						}
						if(phrase.charAt(a) == 'k')
						{
							
						}
						if(phrase.charAt(a) == 'l')
						{
							
						}
						if(phrase.charAt(a) == 'm')
						{
							
						}
						if(phrase.charAt(a) == 'n')
						{
							
						}
						if(phrase.charAt(a) == 'o')
						{
							
						}
						if(phrase.charAt(a) == 'p')
						{
							
						}
						if(phrase.charAt(a) == 'q')
						{
							
						}
						if(phrase.charAt(a) == 'r')
						{
							
						}
						if(phrase.charAt(a) == 's')
						{
							
						}
						if(phrase.charAt(a) == 't')
						{
							
						}
						if(phrase.charAt(a) == 'u')
						{
							
						}
						if(phrase.charAt(a) == 'v')
						{
							
						}
						if(phrase.charAt(a) == 'w')
						{
							
						}
						if(phrase.charAt(a) == 'x')
						{
							
						}
						if(phrase.charAt(a) == 'y')
						{
							
						}
						if(phrase.charAt(a) == 'z')
						{
							
						}
					break;
			}
		
		}
	}
}

