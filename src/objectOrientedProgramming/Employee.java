package objectOrientedProgramming;

public class Employee {
	private double wage;
	private double experience;
	public Employee()
	{
		wage = 45;
		experience = 2;
	}
	public double getWage()
	{
		return wage;
	}
	public double getExperience()
	{
		return experience;
	}
	public void setWage(double xWage)
	{
		wage = xWage;
	}
	public void raise()
	{
		wage = wage * 1.1;
	}
}
