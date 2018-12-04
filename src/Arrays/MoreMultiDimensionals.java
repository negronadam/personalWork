package Arrays;
import java.util.Scanner;
import java.util.Random;
public class MoreMultiDimensionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fix this later!
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		final int ROW = 3;
		final int COLUMN = 7;
		final int THIRD = 9;
		int [][][] three = new int[ROW][COLUMN][THIRD];
		for(int i = 0; i < THIRD; i++)
		{
			for(int a = 0; a < ROW; a++)
			{
				for(int m = 0; m < COLUMN; m++)
				{
					three[i][a][m] = generator.nextInt(9 - 1 + 1);
				}
			}
		}
		
		for(int i = 0; i < THIRD; i++)
		{
			for(int a = 0; a < ROW; a++)
			{
				for(int m = 0; m < COLUMN; m++)
				{
					System.out.print(three[i][a][m] + "\t");
				}
			}
			System.out.println(" ");
		}
	}

}
