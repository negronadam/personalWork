package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring an Array
		// dataType[] arrayName = new dataType[storage]
		/*
		int[] array = {5, 7 , 8, 5, 3, 54, 5, 7, 8, 4, 7, 4, 6, 5, 3, 6,};
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		You can use arrays in loops!
		*/
		/*
			boolean algorithmIsTrue = false;
		    int[] scores = new int[5];
		    scores[0] = 1;
		    scores[1] = 2;
		    scores[2] = 1;
		    scores[3] = 7;
		    scores[4] = 8;
		    int highest = 0;
		    for(int a = 0; a < scores.length - 1; a++)
		    {
		      if (scores[a] > highest)
		      {
		    	System.out.println(scores[a]);
		        a++;
		        highest = scores[a];
		        
		      }
		      else
		      {
		        System.out.println("There is an issue!");
		      }
		    }
		    System.out.println("Algorithm completed...");
		    */
		Scanner input = new Scanner(System.in);
		try {
			File database = new File("Database.txt");
			Scanner reader = new Scanner(database);
			bigArray[] array = new bigArray[3];
			for(int a = 0; a < array.length; a++) {
					array[a] = new bigArray();
					array[a].readItem(reader);
			}
			System.out.println("Array finished with " + array.length + " indices!");
			System.out.println(array[0].getDescription() + " " + array[0].getPrice());
			System.out.println(array[1].getDescription() + " " + array[1].getPrice());
			System.out.println(array[2].getDescription() + " " + array[2].getPrice());
			reader.close();
			PrintWriter writer = new PrintWriter("newRetailDatabase.txt");
			//Successfully writes data included within the object to new file!
			array[0].writeData(writer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Your file was not found!");
		}
	}

}
