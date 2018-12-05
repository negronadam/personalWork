package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> friend = new ArrayList<Friend>();
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Please enter the name and age of a friend");
			friend.add(new Friend(input.nextLine(), input.nextInt()));
		}
		
		for(int a = 0; a < friend.size(); a++)
		{
			System.out.println(friend.get(a));
		}
	}

}
