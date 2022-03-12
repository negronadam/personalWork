package objectOrientedProgramming;
import java.util.Scanner;
public class HI {
	int wallLength = 999;
	int wallHeight = 999;
	int area = 999;
	int timeToPaint = 999;
	Scanner input = new Scanner(System.in);
	public void HomeImpr()
	{
		System.out.println("What is the length of the wall?");
		wallLength = input.nextInt();
		System.out.println("What is the height of the wall");
		wallHeight = input.nextInt();
		
	}
}
