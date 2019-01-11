package Inheritance;

public class Rectangle extends Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	public Rectangle()
	{
		
	}
	
	public Rectangle(double xS1, double xS2, double xS3, double xS4)
	{
		xS1 = s1;
		xS2 = s2;
		xS3 = s3;
		xS4 = s4;
	}
	
	public double area()
	{
		return s1 * s3;
	}
}
