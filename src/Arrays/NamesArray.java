package Arrays;
import java.util.Scanner;
import java.util.Random;
public class NamesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		final int ROW = 4;
		final int COLUMN = 3;
		String[][] names = new String[ROW][COLUMN];
		Friend[][] friends = new Friend[18][5];
		/*
		for(int i = 0; i < ROW; i++)
		{
			for(int a = 0; a < COLUMN; a++)
			{
				System.out.println("Please enter a name");
				names[i][a] = input.nextLine();
			}
		}
		*/
		for(int i = 0; i < 19; i++)
		{
			for(int a = 0; a < 6; a++)
			{
				System.out.println("Please enter a friend");
				String friend = input.nextLine();
				friends[i][a] = new Friend(friend, generator.nextInt(101 - 0 + 1));
			}
		}
		/*
		for(int i = 0; i < ROW; i++)
		{
			for(int a = 0; a < COLUMN; a++)
			{
				System.out.print(names[i][a] + "\t");
			}
			System.out.println("");
		}
		*/
		/*
		System.out.println("----------------------------");
		for(int i = 0; i < ROW; i++)
		{
			for(int a = 0; a < COLUMN; a++)
			{
				System.out.print(names[i][a] + "" + names[i][a].length() + "\t");
			}
			System.out.println("");
		}
		*/
		System.out.println("----------------------------");
		for(int i = 0; i < 19; i++)
		{
			for(int a = 0; a < 6; a++)
			{
				System.out.print(friends[i][a] + "\t");
			}
			System.out.println("");
		}
	}

}
