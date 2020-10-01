package objectOrientedProgramming;
import java.util.Scanner;
import java.lang.Math;
public class RightTriangle {
	Scanner input = new Scanner(System.in);
	private int base;
	private int height;
	private double hypot;
	private double area;

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
		hypot = Math.hypot(base, height);
		return Math.hypot(base, height);
		
	}
	
	

	public double perimeter()
	{
		return hypot + base + height;
		
	}
	
	public double area()
	{
		area = (base * height)/2;
		return area;
		
	}
}
