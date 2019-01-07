package Interfaces;

public class Circle implements Shapes {
private double radius;
    
    public Circle()
    {
	radius = 10;
    }
    public Circle(double r)
    {
         radius = r;
    }
    public double getRadius()
    {
	return radius;
    }
    public void setRadius(double r)
    {
	radius = r;
    }
    public double perimeter()
    {
        return (2.0*Math.PI*radius);
    }
    public double area()
    {
        return (Math.PI*(radius*radius));
    }
}
