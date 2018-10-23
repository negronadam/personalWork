package DecisionStructures;
import java.util.Scanner;
public class WeighClass {
	private int planet;
	private double weight;
	private double wgrav;
	
	Scanner input = new Scanner(System.in);
	
	public WeighClass()
	{
		planet = 0;
		weight = 0.0;
		wgrav = 0;
	}
	
	public void getPlanet()
	{
		System.out.println("What planet would you like to check out?");
		planet = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextInt();
		switch (planet)
		{
			case 1:
				System.out.println("You have chosen Murcury!");
				wgrav = weight * .37;
				System.out.println("Your weight on Murcury would be: " + wgrav);
			break;
			
			case 2:
				System.out.println("You have chosen Venus!");
				wgrav = weight * .88;
				System.out.println("Your weight on Venus would be: " + wgrav);
			break;
			
			case 3:
				System.out.println("You have chosen Mars!");
				wgrav = weight * .38;
				System.out.println("Your weight on Mars would be: " + wgrav);
			break;
			
			case 4:
				System.out.println("You have chosen Jupiter!");
				wgrav = weight * 2.64;
				System.out.println("Your weight on Jupiter would be: " + wgrav);
			break;
			
			case 5:
				System.out.println("You have chosen Saturn!");
				wgrav = weight * 1.15;
				System.out.println("Your weight on Saturn would be: " + wgrav);
			break;
			
			default:
				System.out.println("You have not chosen a valid Planet!");
			break;
			
		}
		
		input.close();
	}
}
