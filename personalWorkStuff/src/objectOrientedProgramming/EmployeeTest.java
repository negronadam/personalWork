package objectOrientedProgramming;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Employee run = new Employee();
		run.getWage();
		System.out.println(run.getWage());
		//Commentttt
		run.getExperience();
		System.out.println("This employee has: " + run.getExperience() + " years of experience!");
		
		
	}

}
