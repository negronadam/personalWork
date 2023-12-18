import java.util.Scanner;
public class Project1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice = 0;
		System.out.println("Choose a program \n 1. Restaurant Program \n 2. Word Game");
		choice = input.nextInt();
		switch(choice) {
		case 1:
		restaurantBill();
		break;
		case 2:
		System.out.println(wordGame());
		break;
		}
	}
	
	public static String sayHello()
	{
		return "Hello World!";
	}
	
	public static void restaurantBill() {
		Scanner input = new Scanner(System.in);
		double cost = -999.0;
		double tipPercent = -999;
		final double SALES_TAX = 0.055;
		System.out.println("Please enter how much your meal cost!");
		cost = input.nextDouble();
		System.out.println("Please enter how much you would like to tip!");
		tipPercent = input.nextDouble();
		System.out.println("The meal cost is: " + cost);
		System.out.println("The tax is: " + SALES_TAX);
		System.out.println("Your selected tip ammount is: " + (tipPercent * cost));
		System.out.printf("Your total bill: ");
		System.out.printf("%.2f", (((tipPercent * cost) + (cost + (cost * SALES_TAX)))));
		input.close();
		}
	public static String wordGame() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Please enter your age");
		String age = input.nextLine();
		System.out.println("Please enter the city you live in");
		String city = input.nextLine();
		System.out.println("Please enter your school");
		String college = input.nextLine();
		System.out.println("Please enter your job");
		String profession = input.nextLine();
		System.out.println("Please enter a favorite animal");
		String animal = input.nextLine();
		System.out.println("Please enter your pet's name");
		String petName = input.nextLine();
		
		return "There was a person named " + name + " who lived in " + city + " at the age of " + age + " " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a " + animal + " named " + petName + ". They all lived happily ever after";
	}

}
