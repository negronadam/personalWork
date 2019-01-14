package Inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;
	public Parallelogram()
	{
		super(10, 10, 10, 10);
		height = 10;
	}
	
	public Parallelogram(double xLength, double xWidth)
	{
		super(xLength, xWidth, xLength, xWidth);
	}
	
	public double area()
	{
		return super.getSide1() * height;
	}
	
	public String toString()
	{
		return "This is a Parallelogram with a height of " + height + super.toString();
	}
}
