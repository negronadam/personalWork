package Arrays;
import java.util.Scanner;
import java.util.Random;
public class MultiDimensionalArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int MAXROW = 500;
		int MAXCOL = 500;
		double wages[][] = new double[MAXROW][MAXCOL];
		for(int i = 0; i < MAXROW; i++)
		{
			for(int a = 0; a < MAXCOL; a++)
			{
				wages[i][a] = (generator.nextInt(100-1+1));
			}
		}
		
		while(1==1)
		{
		for(int i = 0; i < MAXROW; i++)
		{
			for(int a = 0; a < MAXCOL; a++)
			{
				System.out.print(wages[i][a] + "\t");
			}
			System.out.println();
		}
		}
	}

}
