package objectOrientedProgramming;

public class BankSavings {
	private String name;
	private double initAmount;
	
	public BankSavings()
	{
		name = "Defult Name";
		initAmount = 5;
	}
	
	public BankSavings(String xName, double xAmount)
	{
		name = xName;
		initAmount = xAmount;
	}
	
}
