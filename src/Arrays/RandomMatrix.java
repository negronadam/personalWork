package Arrays;
import java.util.Random;
public class RandomMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] randomStuff = new int[25][25];
		Random generator = new Random();
		int random2 = 1 + generator.nextInt(50 - 1 + 1);
		while(1==1)
		{
		for(int i = 0; i < 25; i++)
		{
			for(int a = 0; a < 25; a++)
			{
				randomStuff[i][a] = 1 + generator.nextInt(50 - 1 + 1);
			}
		}
		
		for(int i = 0; i < 25; i++)
		{
			for(int a = 0; a < 25; a++)
			{
				System.out.print(randomStuff[i][a] + "\t");
			}
			System.out.println();
		}
		}
		
	}

}
