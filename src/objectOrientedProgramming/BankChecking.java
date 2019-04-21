package objectOrientedProgramming;

public class BankChecking {
	//TODO finish the banking software I started so long ago.
	private double checkingAmount;
	private String name;
	
	public BankChecking()
	{
		checkingAmount = 530.00;
	}
	
	public BankChecking(String xName, double amount)
	{
		xName = name;
		amount = checkingAmount;
	}
	
	public void addMoney(double amount)
	{
		checkingAmount += amount;
	}
	
	public void removeMoney(double amount)
	{
		checkingAmount -= amount;
	}
	
	public Object clone(String name, double checkingAmount)
	{
		return new BankChecking(name, checkingAmount);
	}
	
	public String toString()
	{
		return "This is a Checking account owned by: " + name + " and with a current balance of: " + checkingAmount;
	}
	
	
	public double getChecking()
	{
		return checkingAmount;
	}
	
	
	
	
}
