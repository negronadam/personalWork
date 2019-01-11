package Inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;
	public Trapezoid()
	{
		super(10, 10, 10, 10);
	}
	
	public Trapezoid(double s1, double s2, double s3, double s4, double xHeight)
	{
		super(s1, s2, s3, s4);
		height = xHeight;
	}
	
	public double area()
	{
		return ((super.getSide3() + super.getSide4())/2) * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
