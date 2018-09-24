package inputExamples;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend;
		int divisor;
		int remainder;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the divisor");
		divisor = input.nextInt();
		System.out.println("Please enter the dividend");
		dividend = input.nextInt();
		remainder = dividend % divisor;
		System.out.println("The remainder from the divison is: " + remainder);
	}

}
