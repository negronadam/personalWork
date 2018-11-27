package Arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] grades = new int[5];
		int totalScore = 999;
		for(int i = 0; i < grades.length; i++)
		{
			System.out.print("Test Score:");
			grades[i] = input.nextInt();
			
		}
		for(int m = 0; m < grades.length; m++)
		{
			totalScore += grades[m];
		}
		System.out.println("The sum of the grades is: " + totalScore);
		
		input.close();
	}

}
