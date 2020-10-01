package inputExamples;
import java.util.Scanner;
public class mathOperatorsContinued {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double eq1 = 4/3;
		double pi = Math.PI;
		double radius;
		double volume;
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		
		volume = 4.0/3.0 * pi * radius * radius * radius;
		System.out.println("The Volume of the Sphere is: " + volume);
	}

}
