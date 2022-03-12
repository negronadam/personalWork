package Interfaces;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ShapesInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		int length = input.nextInt();
		System.out.println("What is the width of the rectangle?");
		int width = input.nextInt();
		Shapes rectangle = new Rectangle(length, width);
		Rectangle rectangle2 = new Rectangle(7,9);
		System.out.println("The perimeter of the rectangle is: " + df.format(rectangle.perimeter()));
		System.out.println("The area of the rectangle is: " + df.format(rectangle.area()) + "" + rectangle2.getLength());
		System.out.println("What is the radius of a circle?");
		int radius = input.nextInt();
		Shapes circle = new Circle(radius);
		System.out.println("The circle's area is: " + df.format(circle.area()));
		System.out.println("The circle's perimeter is: " + df.format(circle.perimeter()));
	}

}
