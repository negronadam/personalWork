package objectOrientedProgramming;
import java.util.Scanner;
import java.lang.Math;
public class RightTriangle {
	Scanner input = new Scanner(System.in);
	private int base;
	private int height;

	public RightTriangle(int base, int height) {

	}
	
	public RightTriangle()
	{
		
	}
	
	public int base()
	{
		return base;
	}
	
	public int inbase()
	{
		base = input.nextInt();
		return base;
		
		
	}
	public int inheight()
	{
		height = input.nextInt();
		return height;
	}
	
	public int height()
	{
		return height;
	}
	public double hypot()
	{
		return Math.hypot(base, height);
		
	}

	public double perimeter()
	{
		return base;
		
	}
	
	public double area()
	{
		return base;
		
	}
}
