package Arrays;
import java.util.Random;
import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rectangle = new Rectangle [2];
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int min = 10;
		int max = 56;
		int width = 999;
		int length = 999;
		int randomNum = 0;
		for(int i = 0; i < rectangle.length; i++)
		{
			rectangle[i] = new Rectangle((generator.nextInt(56 - 10 + 1)), generator.nextInt(56 - 10 + 1));
		}
		int smallArea = 0;
		int smallIndex = 0;
		for(int a = 0; a < rectangle.length; a++)
		{
				System.out.println("Rectangle: " + a);
				System.out.println(rectangle[a].getLength());
				System.out.println(rectangle[a].getWidth());
				System.out.println(rectangle[a].area());
				if(rectangle[a].area() < smallArea)
				{
					smallArea = rectangle[a].area();
					smallIndex = a;
				}
		}
		System.out.println("The smallest area is: " + smallArea);
		System.out.println("The index is : " + smallIndex);
	}

}
