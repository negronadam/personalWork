package Arrays;
import java.util.Scanner;
public class GradeBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		int numStudents = input.nextInt();
		System.out.println("How many tests have been taken?");
		int numTests = input.nextInt();
		int[][] Gradebook = new int[numStudents][numTests];
		String[] nameStudent = new String[numStudents + 1];
		for(int e = 0; e < numStudents + 1; e++)
		{
			System.out.println("Please enter a student's name");
			nameStudent[e] = input.nextLine();
		}
		for(int i = 0; i < numStudents; i++)
		{
			for(int a = 0; a < numTests; a++)
			{
				System.out.println("Please enter the score of each test.");
				Gradebook[i][a] = input.nextInt();
			}
			
		}
		
		for(int i = 0; i < numStudents; i++)
		{
			for(int a = 0; a < numTests; a++)
			{
				System.out.print(nameStudent[a]);
				System.out.print(Gradebook[i][a] + "\t");
			}
			System.out.println(" ");
		}
	}

}
