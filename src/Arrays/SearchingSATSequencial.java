package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class SearchingSATSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		ArrayList<Integer> satScores = new ArrayList<Integer>();
		boolean numIsIn = false;
		int timesNumIsIn = 0;
		for(int i = 0; i < 1000; i++)
		{
			satScores.add(1 + generator.nextInt(1600 - 1 + 1));
		}
		
		System.out.println("Please enter a number");
		int num = input.nextInt();
		for(int a = 0; a < satScores.size(); a++)
		{
			if(satScores.get(a) == num)
			{
				numIsIn = true;
				timesNumIsIn++;
			}
		}
		
		System.out.println("Is the number: " + num + " Inside of the ArrayList? " + numIsIn + " And it is in the ArrayList " + timesNumIsIn + " Times!");
		System.out.println("Scores: ------------------------------------");
		for(int m = 0; m < satScores.size(); m++)
		{
			System.out.println(satScores.get(m));
		}
	}

}
