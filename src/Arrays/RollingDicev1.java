package Arrays;

import java.util.Random;
import java.util.Scanner;

public class RollingDicev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many students are in the class?");
		int MAXROW = input.nextInt();
		System.out.println("How many sides are on a dice?");
		int MAXCOL = input.nextInt();
		System.out.println("How many times should each studnet roll the die?");
		int timesRolled = input.nextInt();
		int sum = 0;
		double wages[][] = new double[MAXROW][MAXCOL];
		for(int i = 0; i < MAXROW; i++)
		{
			for(int a = 0; a < MAXCOL; a++)
			{
				wages[i][a] = (generator.nextInt(100-1+1));
			}
		}
		
		for(int i = 0; i < MAXROW; i++)
		{
			for(int a = 0; a < MAXCOL; a++)
			{
				sum += wages[i][a];
				System.out.print(wages[i][a] + "\t");
			}
			System.out.println();
		}
		System.out.println("The sum of the array is: " + sum);
	}

}
