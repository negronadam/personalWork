package objectOrientedProgramming;
import java.util.Scanner;
public class Area {
	Scanner input = new Scanner(System.in);
	int base = 999;
	int height = 999;
	int area = 999;
	int areaOfDoor = 999;
	int baseOfDoor = 999;
	int heightOfDoor = 999;
	int areaWallNoDoor = 999;
	
	public void Area()
	{
		System.out.println("What is the base of the wall?");
		base = input.nextInt();
		System.out.println("What is the height of the wall?");
		height = input.nextInt();
		area = (base * height);
		System.out.println("The area of your wall is: " + area);
		System.out.println("What is the base of the door?");
		baseOfDoor = input.nextInt();
		System.out.println("What is the height of the door?");
		heightOfDoor = input.nextInt();
		areaOfDoor = (baseOfDoor * heightOfDoor);
		System.out.println("The area of your door is: " + areaOfDoor);
		areaWallNoDoor = (area - areaOfDoor);
		System.out.println("The area of your wall without the door is: "+ areaWallNoDoor);
	}
	
}
