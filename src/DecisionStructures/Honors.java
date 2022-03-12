package DecisionStructures;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double gpa = 999;
		int sClass = 999;
		System.out.println("What class are you in?");
		sClass = input.nextInt();
		System.out.println("What is your GPA?");
		gpa = input.nextDouble();
		if (sClass < 12 && gpa <= 3.5)
		{
			System.out.println("You are unable to graduate");
		}
		else
		{
			System.out.println("Yay you can graduate with honors!");
		}
	}

}
