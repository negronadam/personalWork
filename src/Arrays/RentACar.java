package Arrays;
import java.util.Scanner;

import objectOrientedProgramming.Car;

import java.util.Random;
public class RentACar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int carsOwned = -999;
		System.out.println("How many cars does your company own?");
		carsOwned = input.nextInt();
		double[] cars = new double[carsOwned];
		CarClass[] car = new CarClass[carsOwned];
		int quit = 1;
		int menuChoice = 0;
		String[] carMake = new String[carsOwned];
		for(int i = 0; i < cars.length; i++)
		{	
			System.out.println("What is the make of your car?");
			carMake[i] = input.nextLine();
		}
		for(int a = 0; a < cars.length; a++)
		{
			System.out.println("Please enter the following information for: " + carMake[a]);
			System.out.println("What is the miles per gallon?");
			double aMPG = input.nextDouble();
			System.out.println("What is the maximum capacity of the car?");
			double aCapacity = input.nextDouble();
			System.out.println("How much fuel is in the car?");
			double aFuel = input.nextDouble();
			System.out.println("What is the number of miles on the Odometer?");
			double aOdometer = input.nextDouble();
		}
		while(quit == 1)
		{
			System.out.println("Welcome to the CRS (Car Record System)");
			System.out.println("1. Drive a car.");
			System.out.println("2. Put gas in a car.");
			System.out.println("3.Pay your rent on the car.");
			switch (menuChoice)
			{
				case 1: 
					System.out.println("You chose to drive the car...");
					System.out.println("How many miles will you drive?");
					int miles = input.nextInt();
					System.out.println("You drove the car for: " + miles + " miles!");
					System.out.println();
				break;
			}
		}
	}

}
