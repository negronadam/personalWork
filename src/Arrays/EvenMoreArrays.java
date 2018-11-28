package Arrays;

import java.util.Scanner;

public class EvenMoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] friends = new String[5];
		for(int i = 0; i < friends.length; i++)
		{
			System.out.println("Enter a name of a friend.");
			friends[i] = input.nextLine();
		}
		System.out.println("Please enter a length of a name");
		int length = input.nextInt();
		int match = 0;
		for(int a = 0; a < friends.length; a++)
		{
			if (friends[a].length() == length)
			{
				match++;
			}
			
		}
		System.out.println(match + " of your friend names matched the length!");
	}

}
