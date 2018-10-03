package objectOrientedProgramming;
import java.util.Scanner;
public class Area {
	Scanner input = new Scanner(System.in);
	int base = 999;
	int height = 999;
	int area = 999;
	public void Area()
	{
		System.out.println("What is the base of the wall?");
		base = input.nextInt();
		System.out.println("What is the height of the wall?");
		height = input.nextInt();
		area = (base * height);
		System.out.println("The height of your wall is: " + area);
	}
	
}
