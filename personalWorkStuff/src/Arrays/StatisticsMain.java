package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Console;
public class StatisticsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows in the dataset");
		int row = input.nextInt();
		System.out.println("Please enter the number of columns in the dataset");
		int column = input.nextInt();
		int[][] test = new int[row][column];
		for(int a = 0; a < row; a++)
		{
			for(int i = 0; i < column; i++)
			{
				System.out.println("Please enter a value");
				test[a][i] = input.nextInt();
			}
		}
		
		for(int a = 0; a < row; a++)
		{
			for(int i = 0; i < column; i++)
			{
				System.out.print(test[a][i] + " ");
			}
			System.out.println("");
		}
		int numProcessed = 0;
		for(int a = 0; a < row; a++)
		{
			int numAppears = 0;
			for(int e = 0; e < column; e++)
			{
					numProcessed++;
					int num = test[a][e];
					if(test[a][e] == num)
					{
						numAppears++;
					}
				System.out.println("The Number " + test[a][e] + " appears " + numAppears + " Times!");
			}
		}
		 
				
	}

}
