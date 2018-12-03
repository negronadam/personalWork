package Arrays;
import java.util.Scanner;
import java.util.Random;
public class RentACar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int carsOwned = -999;
		System.out.println("How many cars does your company own?");
		carsOwned = input.nextInt();
		int[] cars = new int[carsOwned];
		String[] carMake = new String[carsOwned];
		for(int i = 0; i < cars.length; i++)
		{	
			System.out.println("What is the make of your car?");
			carMake[i] = input.nextLine();
		}
		for(int a = 0; a < cars.length; a++)
		{
			System.out.println(carMake[a]); 
		}
	}

}
