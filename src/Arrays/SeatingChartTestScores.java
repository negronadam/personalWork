package Arrays;
import java.util.Scanner;
public class SeatingChartTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int row = 2;
		final int column = 2;
		Double[][] testScores = new Double[row][column];
		int studentsThatPassed = 0;
		for(int i = 0; i < row; i++)
		{
			for(int a = 0; a < column; a++)
			{
				System.out.println("What is the test score for this student?");
				testScores[i][a] = input.nextDouble();
				if(testScores[i][a] >= 69.9)
				{
					studentsThatPassed++;
				}
			}
		}
		for(int i = 0; i < row; i++)
		{
			for(int a = 0; a < column; a++)
			{
				System.out.print(testScores[i][a] + "\t");
			}
			System.out.println();
		}
		System.out.println(studentsThatPassed + " Students passed the test!");
	}

}
