package Arrays;
import java.util.Scanner;
public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] friends = new String[5];
		for(int i = 0; i < friends.length; i++)
		{
			System.out.println("Please enter a name of a friend.");
			friends[i] = input.nextLine();
		}
		
		for(int a = (friends.length - 1); a >= 0; a--)
		{
			System.out.println(friends[a]);
		}
	}

}
