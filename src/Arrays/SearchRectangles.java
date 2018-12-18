package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class SearchRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		boolean numIsIn = false;
		for(int i = 0; i < 1000; i++)
		{
			rectangles.add(new Rectangle(1 + generator.nextInt(499 - 1 + 1), 1 + generator.nextInt(499 - 1 + 1)));
		}
		
		System.out.println("Please enter a number");
		int num = input.nextInt();
		for(int a = 0; a < rectangles.size(); a++)
		{
			if(rectangles.get(a).getWidth() == num)
			{
				numIsIn = true;
			}
		}
		
		System.out.println("Is there a width of: " + num + " Inside of the ArrayList? " + numIsIn);
		System.out.println("Rectangles: ------------------------------------");
		for(int m = 0; m < rectangles.size(); m++)
		{
			System.out.println("Length of rectangle " + m + " : " + rectangles.get(m).getLength() + " Widgth of rectangle " + m + " : " + rectangles.get(m).getWidth());
		}
		
	}

}
