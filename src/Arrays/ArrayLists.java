package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arraylist = new ArrayList();
		Scanner input = new Scanner(System.in);
		/*
		ArrayList <Rectangle> rectangle  = new ArrayList<Rectangle>();
		*/
		ArrayList<String> string = new ArrayList<String>();
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Please enter a name");
			String name = input.nextLine();
			string.add(name);
			if(i == 2)
			{
				string.add(0, "Bob");
			}
		}
		
		for(int a = 0; a < string.size(); a++)
		{
			System.out.println(string.get(a));
		}
		
	}

}
