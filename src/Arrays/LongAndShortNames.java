package Arrays;
import java.util.Scanner;
public class LongAndShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numberFriends;
		System.out.println("Please enter the number of people you know");
		numberFriends = input.nextInt();
		String[] num = new String[numberFriends + 1];
		int longestName = 999;
		String longest = "test";
		String shortest = "awesomeplaceholder";
		for(int i = 0; i < num.length; i++)
		{
			System.out.println("Please enter a name");
			num[i] = input.nextLine();
		}
		input.nextLine();
		for(int e = 0; e < num.length; e++)
		{
			System.out.println(num[e]);
		}
		for(int a = 0; a < num.length; a++)
		{
			if(num[a].length() > longest.length())
			{
				longest = num[a];
			}
		}
		System.out.println("The longest name in the array is: " + longest);
		for(int a = 0; a < num.length; a++)
		{
			if(num[a].length() < shortest.length())
			{
				shortest = num[a];
			}
		}
		System.out.println("The shortest name in the array is: " + shortest);
		
	}

}
