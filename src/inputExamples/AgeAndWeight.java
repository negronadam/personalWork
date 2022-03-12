package inputExamples;
import java.util.Scanner;

public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		double weight;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextDouble();
		System.out.println("Your age is:" + age);
		System.out.println("Your weight:"+ weight);
	}

}
