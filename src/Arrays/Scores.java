package Arrays;
import java.util.Scanner;
import java.util.Random;
public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random(5985);
		int[] grades = new int[250];
		int min = 0;
		int max = 100;
		int randomNum = 0;
		int largest = 0;
		for(int i = 0; i < 250; i++)
		{
			grades[i] = generator.nextInt(max - min + 1);
		}
		
		for(int j = 0; j < 250; j++)
		{
			if(grades[j] > largest)
			{
				largest = grades[j];
			}
		}
		System.out.println(largest);
	}

}
