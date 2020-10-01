package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight;
		int age;
		int luckyNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your weight");
		weight = input.nextInt();
		System.out.println("Please enter your age");
		age = input.nextInt();
		System.out.println("Please enter your lucky number");
		luckyNumber = input.nextInt();
		System.out.println("In the future...");
		System.out.println("I see...");
		System.out.println(luckyNumber + " years from now...");
		System.out.println("You will be resident number " + age + weight);
		System.out.println("At the old folks home.");
	}

}
