package objectOrientedProgramming;

public class BankTest {

	public static void main(String[] args) {
		BankChecking cAccount = new BankChecking("Tester", 500, 001);
		cAccount.getChecking();
		System.out.println(cAccount.getChecking());
	}

}
