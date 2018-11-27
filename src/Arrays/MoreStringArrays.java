package Arrays;
import java.util.Scanner;
public class MoreStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] friends = new String[5];
		for(int i = 0; i < friends.length; i++)
		{
			System.out.println("Enter a name of a friend.");
			friends[i] = input.nextLine();
		}
		System.out.println("Please enter a letter");
		String letter = input.nextLine();
		
		for(int a = 0; a < friends.length; a++)
		{
			if (friends[a].endsWith(letter.substring(0,1)))
			{
				System.out.println("The names " + friends[a] + " ends with " + letter);
			}
			
		}
	}

}
