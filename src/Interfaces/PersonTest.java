package Interfaces;
import java.util.Scanner;
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the student?");
		String sName = input.nextLine();
		System.out.println("What is the age of the student?");
		int sAge = input.nextInt();
		Person student = new Student(sName, sAge);
		
	}

}
