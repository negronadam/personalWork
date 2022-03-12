package DesigningClasses;
import java.util.ArrayList;
import java.util.Scanner;
public class EncryptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> encrypt = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		boolean programIsRunning = true;
		String phrase = "";
		System.out.println("Menu:");
		System.out.println("1. Interactive Menu Demo");
		System.out.println("2. Encrypter");
		int menuChoice = input.nextInt();
		switch(menuChoice)
			{
					
				case 2:
					System.out.println("Welcome to Adam Negron's Encrypter!");
					System.out.println("Please enter a phrase to be encrypted.");
					phrase = input.nextLine();
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
							encrypt.add(34);
						}
						if(phrase.charAt(a) == 'e')
						{
							encrypt.add(45);
						}
						if(phrase.charAt(a) == 'f')
						{
							encrypt.add(55);
						}
						if(phrase.charAt(a) == 'g')
						{
							encrypt.add(75);
						}
						if(phrase.charAt(a) == 'h')
						{
							encrypt.add(104);
						}
						if(phrase.charAt(a) == 'i')
						{
							encrypt.add(236);
						}
						if(phrase.charAt(a) == 'j')
						{
							encrypt.add(234);
						}
						if(phrase.charAt(a) == 'k')
						{
							encrypt.add(214);
						}
						if(phrase.charAt(a) == 'l')
						{
							encrypt.add(115);
						}
						if(phrase.charAt(a) == 'm')
						{
							encrypt.add(908);
						}
						if(phrase.charAt(a) == 'n')
						{
							encrypt.add(997);
						}
						if(phrase.charAt(a) == 'o')
						{
							encrypt.add(235);
						}
						if(phrase.charAt(a) == 'p')
						{
							encrypt.add(239);
						}
						if(phrase.charAt(a) == 'q')
						{
							encrypt.add(241);
						}
						if(phrase.charAt(a) == 'r')
						{
							encrypt.add(52);
						}
						if(phrase.charAt(a) == 's')
						{
							encrypt.add(57);
						}
						if(phrase.charAt(a) == 't')
						{
							encrypt.add(23);
						}
						if(phrase.charAt(a) == 'u')
						{
							encrypt.add(12);
						}
						if(phrase.charAt(a) == 'v')
						{
							encrypt.add(5);
						}
						if(phrase.charAt(a) == 'w')
						{
							encrypt.add(1);
						}
						if(phrase.charAt(a) == 'x')
						{
							encrypt.add(78);
						}
						if(phrase.charAt(a) == 'y')
						{
							encrypt.add(32);
						}
						if(phrase.charAt(a) == 'z')
						{
							encrypt.add(100);
						}
					break;
			}
					for(int m = 0; m < encrypt.size(); m++)
					{
						System.out.println("Your new encryption key is: ");
						System.out.print(encrypt.get(m));
					}
		
		}
	}
}

