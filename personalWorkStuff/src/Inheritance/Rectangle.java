package Inheritance;

public class Rectangle extends Quadrilateral implements Geo {
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	public Rectangle()
	{
		super(100,100,100,100);
	}
	
	public Rectangle(double length, double width)
	{
		super(length, width, length, width);
	}
	
	public void getSide1(double xLength)
	{
		super.getSide1();
	}
	
	public double area()
	{
		return s1 * s3;
	}
	
	public double perimeter()
	{
		return 0;
	}
}
