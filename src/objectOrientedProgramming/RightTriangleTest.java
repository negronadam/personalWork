package objectOrientedProgramming;
import java.util.Scanner;
public class RightTriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		RightTriangle triangle = new RightTriangle();
		System.out.println("What is the base of the triangle?");
		triangle.inbase();
		System.out.println("The base of the triangle is: " + triangle.base());
		System.out.println("What is the height of the triangle?");
		triangle.inheight();
		System.out.println("The height of your triangle is: " + triangle.height());
		System.out.println("The hypotenuse of your triangle is: " + triangle.hypot());
		System.out.println("The perimeter of your triangle is : " + triangle.perimeter());
		System.out.println("The area of your triangle is: " + triangle.area());
		

	}

}
