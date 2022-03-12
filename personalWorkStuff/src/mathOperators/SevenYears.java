package mathOperators;
import java.util.Scanner;
public class SevenYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your age to see how old you will be in 7 years!");
		age = input.nextInt();
		age = age + 7;
		System.out.println("You will be: " + age + " Years old in 7 years!");
	}

}
