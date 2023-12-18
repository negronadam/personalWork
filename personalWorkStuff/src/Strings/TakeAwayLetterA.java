package Strings;
import java.util.Scanner;
public class TakeAwayLetterA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		String test = "Test";
		System.out.println("Please enter a sentence.");
		test = input.nextLine();
		for(int i = 0; i < test.length(); i++)
		{
			if(test.charAt(i) == 'a' || test.charAt(i) == 'A' || test.charAt(i) == ' ')
			{
				System.out.println("");
			}
		}
		*/
		Scanner scnr = new Scanner(System.in);
	      int numInts;
	      boolean allNegative = false;
	   
	      numInts = scnr.nextInt();
	      for(int a = 0; a < numInts; a++){
	         int num = scnr.nextInt();
	         if(num >= 0){
	            allNegative = false;
	         }
	         else{
	           allNegative = true; 
	         }
	      }

	      if (allNegative) {
	         System.out.println("All match");
	      }
	      else {
	         System.out.println("Not all match");
	      }
	}

}
