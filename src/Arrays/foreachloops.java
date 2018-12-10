package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class foreachloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		/*
		 * Fix all of this later!
		System.out.println("How many students are in the class?");
		int numStudents = input.nextInt();
		int[] studentAges = new int[numStudents];
		for(int i = 0; i < numStudents; i++)
		{
			System.out.println("Please enter the ages of each student");
			studentAges[i] = input.nextInt();
		}
		int age = 0;
		for(int ages : studentAges)
		{
			age = studentAges[ages];
			System.out.println(age);
		}
		*/
		/*
		ArrayList<Double> wages = new ArrayList<Double>();
		System.out.println("How many employees work in your company?");
		int employees = input.nextInt();
		for(int i = 0; i < employees; i++)
		{
			System.out.println("What is the wage for employee " + i + "?");
			wages.add(input.nextDouble());
		}
		
		for(int a = 0; a < wages.size(); a++)
		{
			System.out.println("Employee " + a + "'s wage is " + wages.get(a));
		}
		System.out.println("-----------------------");
		for(double moreWages : wages)
		{
			System.out.println(moreWages);
		}
		double hWage = 0.0;
		for(double worker : wages)
		{
			if(hWage < worker)
			{
				hWage = worker;
			}
		}
		
		System.out.println("The highest wage is: " + hWage);
		*/
		
		ArrayList<Circle> circle = new ArrayList<Circle>();
		for(int i = 0; i < 2; i++)
		{
			System.out.println("Please enter the radii of a circle");
			circle.add(new Circle(input.nextDouble()));
		}
		
		for(Circle a : circle)
		{
			System.out.println(a.area());;
		}
		
	}
}
