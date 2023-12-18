import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RetailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File database = new File("Database.txt");
			Scanner reader = new Scanner(database);
			RetailItem[] array = new RetailItem[3];
			for(int a = 0; a < array.length; a++) {
					array[a] = new RetailItem();
					array[a].readItem(reader);
			}
			System.out.println("Array finished with " + array.length + " indices!");
			for(int a = 0; a < array.length; a++) {
				System.out.println(array[a].getDescription() + " " + array[a].getUnitsOnHand() + " " + array[a].getPrice());
			}
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
