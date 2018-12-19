package Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiArraysActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int MAXROW = 3;
		int MAXCOL = 7;
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
