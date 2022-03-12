package objectOrientedProgramming;
import java.util.Scanner;
public class PetsAndGarage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pets = 999;
		int cars = 999;
		System.out.println("How many pets do you have?");
		pets = input.nextInt();
		System.out.println("How many cars can fit into your garage");
		cars = input.nextInt();
		System.out.println(pets >= 5 || cars > 3);

	}

}
