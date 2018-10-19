package DecisionStructures;
import java.util.Scanner;
public class NestedDecisionStructures {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int salary = 999;
		System.out.println("What is your annual salary?");
		salary = input.nextInt();
		if (salary < 20000)
		{
			System.out.println("You are a worker...");
			
				if (salary >= 20000 && salary <= 40000 )
				{
					System.out.println("You are a normie manager...");
					
					if (salary > 40000 && salary >= 60000 )
					{
						System.out.println("You are a CEO!");
					}
				}
		}

	}

}
