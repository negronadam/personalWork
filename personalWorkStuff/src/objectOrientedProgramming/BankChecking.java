package objectOrientedProgramming;

public class BankChecking {
	//TODO finish the banking software I started so long ago.
	private String name;
    private double balance;
    private int id;

    public BankChecking(){
        this.name = "";
        this.balance = 0;
        this.id = 0;
    }

    public BankChecking(String name, double balance, int id){
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double xBal) {
        this.balance = xBal;
    }

    public int getId() {
        return id;
    }

    public void setId(int xId) {
        this.id = xId;
    }
    
    public String getChecking() {
    	return "This checking account belongs to: " + name + " With a balance of: " + balance + " With an ID of: " + id;
    }
	
	
	
	
}
