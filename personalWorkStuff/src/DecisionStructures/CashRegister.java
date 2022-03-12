package DecisionStructures;

public class CashRegister {
	private double initBal;
	private double initTransact;
	private double newBal;
 public CashRegister(){
	 double initBal = 500.00;
	 double initTransact = 0.0;
	 
 }
 
 	public void setBal(double newBal)
 	{
 		newBal = newBal;
 	}
 	
 	public double getBal()
 	{

 		return newBal;
 	}
 
 	public void sellSomething(double newBal, double transaction)
 	{
 		newBal = newBal - transaction;
 	}
 	
 	
}
