package Strings;
import java.util.Scanner;
public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String awesome1 = "Awesome";
		String awesome2 = "Adam";
		System.out.println("Please enter a name");
		awesome1 = input.nextLine();
		System.out.println("Please enter another name");
		awesome2 = input.nextLine();
		if(awesome1.compareTo(awesome2) > 0)
		{
			System.out.println("Yes!");
		}
		
		System.out.println("Lets be friends");
	}

}
