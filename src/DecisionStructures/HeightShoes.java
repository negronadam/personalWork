package DecisionStructures;
import java.util.Scanner;
public class HeightShoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int shoeSize = 999;
		int height = 999;
		System.out.println("What is your shoe size?");
		shoeSize = input.nextInt();
		System.out.println("What is your height");
		height = input.nextInt();
		System.out.println(shoeSize == height);
		if (shoeSize >= height && 1 == 1)
		{
			System.out.println("Wow! You have big feet!");
		}
		else
		{
			System.out.println("You are a failure.");
		}
		input.close();
	}

}
