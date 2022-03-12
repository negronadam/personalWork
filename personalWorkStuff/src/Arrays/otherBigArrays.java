package Arrays;

import java.util.Scanner;

public class otherBigArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] grades = new int[5];
		int totalScore = 0;
		for(int i = 0; i < grades.length; i++)
		{
			System.out.print("Test Score:");
			grades[i] = input.nextInt();
			
		}
		for(int m = 0; m > 0; m--)
		{
			System.out.println(grades[m]);
		}
		
		input.close();
		
		//Fix this later
	}

}
