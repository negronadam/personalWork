package DecisionStructures;
import java.util.Scanner;
public class DecisionStructures {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 999;
		System.out.println("What is your age?");
		age = input.nextInt();
		if (age <= 18)
		{
			System.out.println("Lol you are a minor");
		}
		
		else
		{
			System.out.println("Lol you are not a minor");
		}
	}

}
