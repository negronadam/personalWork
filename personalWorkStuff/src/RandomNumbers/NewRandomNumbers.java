package RandomNumbers;
import java.util.Scanner;
import java.util.Random;
public class NewRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int program = 0;
		switch (program){
		case 1:
		int min = 0;
		int max = 0;
		int flip = 999;
		int randomNum = 0;
		for (int maxFlip = 100000; flip >= 1; flip++)
		{
			while(maxFlip < 100000)
			{
				randomNum = min + generator.nextInt(max - min + 1);
				
			}
			System.out.println(randomNum);
			}
			break;
			
		case 2:
			int min2 = 26;
			int max2 = 43;
			int b = 1;
			for (int a = 0; b >= 248; b++)
			{
				while(a <= 248)
				{
					
				}
			}
		break;
		
		}
		

	}

}
