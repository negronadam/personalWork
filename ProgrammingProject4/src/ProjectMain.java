import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("names.txt");
		boolean running = true;
		while(running) {
		//Use this one for general purpose input from user.
		Scanner input = new Scanner(System.in);
		try {
		Scanner reader = new Scanner(file);
		//Wanted easy way to store and access all the loaded values so I made an ArrayList of Strings
		ArrayList<String> names = new ArrayList<String>();
		//Filling ArrayList with all info from the file
		while(reader.hasNextLine()) {
			names.add(reader.nextLine());
		}
		System.out.println("This program allows you to search through the data from\nthe Social Security Administration to see\nhow popular a particular name has been since 1900.\nPlease enter a name to find info or enter 'q' to quit");
		String testString = input.nextLine();
		if(testString.equals("q")) {
			break;
		}
		for(int a = 0; a < names.size(); a++) {
			//temp is used to pull the name from the string at the indicated index, Yes I know this could be done in fewer lines but I wasn't thinking about that at the time.
			String temp = names.get(a).substring(0, names.get(a).indexOf(' '));
			int space = names.get(a).indexOf(' ');
			//Checking to find the right index then loads it into a scanner to begin outputting the relevant information.
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
