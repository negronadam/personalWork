package Arrays;
import java.util.Scanner;
import java.awt.datatransfer.SystemFlavorMap;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;
public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int[] grades = new int[250];
		int min = 0;
		int max = 1000;
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
		*/
		File file = new File("names.txt");
		boolean running = true;
		while(running) {
		Scanner input = new Scanner(System.in);
		try {
		Scanner reader = new Scanner(file);
		//Wanted easy way to store and access all the loaded values so I made an ArrayList of Strings
		ArrayList<String> names = new ArrayList<String>();
		while(reader.hasNextLine()) {
			names.add(reader.nextLine());
		}
		System.out.println("Please enter a name to find info or enter 'q' to quit");
		String testString = input.nextLine();
		if(testString.equals("q")) {
			break;
		}
		for(int a = 0; a < names.size(); a++) {
			//temp is used to pull the name from the string at the indicated index
			String temp = names.get(a).substring(0, names.get(a).indexOf(' '));
			int space = names.get(a).indexOf(' ');
			if(temp.equals(testString)) {
				Scanner numInput = new Scanner(names.get(a));
				int iterations = 0;
				int year = 1900;
				while(numInput.hasNext()) {
					if(iterations == 0) {
						System.out.println("Statistics on name: " + "\"" +numInput.next() + "\"");
						iterations++;
					}
					else if(iterations > 0) {
						System.out.println("      " + year + ": " + numInput.next());
						year += 10;
					}
			}
				
		}
			/* For some reason this kept spitting out the wrong thing at me and I could never figure it out.
			else {
				System.out.println("Name not found!");
			}
			*/
		}
		//input.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			
			}
		}
	}

}
