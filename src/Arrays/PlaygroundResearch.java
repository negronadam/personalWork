package Arrays;
import java.util.Random;
import java.lang.Math;
import java.text.DecimalFormat;
public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.#");
		Random generator = new Random();
		double[][] kids = new double[10][12];
		int allHeight = 0;
		int averageHeight = 0;
		double tallest = 0;
		int shortest = 0;
		for(int i = 0; i < 10; i++)
		{
			for(int a = 0; a < 12; a++)
			{
				if(1 + generator.nextInt(3 - 1 + 1) != 2)
				{
					kids[i][a] = 4.1 + (6.0 - 4.1) * generator.nextDouble();
					kids[i][a] = kids[i][a] + (Math.round(.1));
					kids[i][a] += allHeight;
				}
			}
		}
		
		for(int i = 0; i < 10; i++)
		{
			for(int a = 0; a < 12; a++)
			{
				System.out.print(kids[i][a] + "\t");
				if(tallest < kids[i][a])
				{
					tallest = kids[i][a];
				}
			}
			System.out.println();
		}
	}

}
