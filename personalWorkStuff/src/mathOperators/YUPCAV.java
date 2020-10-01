package mathOperators;
import java.util.Scanner;
public class YUPCAV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int votingAge;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = input.nextInt();
		votingAge = 18 - age;
		System.out.println("You can vote in: " + votingAge + " Years!");
		System.out.println("Update 1.0.1a");
	}

}
