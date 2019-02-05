package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;  
public class HouseArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		ArrayList<House> house = new ArrayList<House>();
		for(int a = 0; a < 2; a++)
		{
			System.out.println("Who owns the house? Use the last name");
			String xName = input.nextLine();
			System.out.println("How many residents are in the house?");
			int xRes = input.nextInt();
			System.out.println("How many pets are in the house?");
			int xPet = input.nextInt();
			System.out.println("How many floors are in the house?");
			int xFloor = input.nextInt();
			System.out.println("How much money is the house valued at?");
			int xValue = input.nextInt();
			house.add(new House(xName, xRes, xPet, xFloor, xValue));
		}
		
		for(int a = 0; a < house.size(); a++)
		{
			System.out.println(house.get(a).toString());
		}
		
		input.close();
	}

}
