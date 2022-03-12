package Sigma;

public class SigmaNumber {
	//TODO make an interface to implement these methods in separate Sigma Int and Double wrapper classes
	private String name;
	private int num;
	private double x;
	private double y;
	public SigmaNumber()
	{
		name = "";
		num = 0;
		x = 0;
		y = 0;
	}
	
	public SigmaNumber(double xValue)
	{
		this.x = xValue;
	}
	
	public SigmaNumber(int yValue)
	{
		this.y = yValue;
	}
	
	public SigmaNumber(double xNum, double yNum)
	{
		this.x = xNum;
		this.y = yNum;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String xName)
	{
		this.name =  xName;
	}
	
	public double getNumber()
	{
		return num;
	}
	
	public void setNumber(int xNum)
	{
		this.num = xNum;
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setX(int xValue)
	{
		this.x = xValue;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setY(int yValue)
	{
		this.y = yValue;
	}
}
