import java.io.PrintWriter;
import java.util.Scanner;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	private Scanner reader;
	private PrintWriter writer;
	
	public RetailItem(String name, int units, double price) {
		this.description = name;
		this.unitsOnHand = units;
		this.price = price;
	}
	
	public RetailItem() {
		this.description = "placeholder";
		this.unitsOnHand = 0;
		this.price = 0;
	}
	public void setDescription(String desc) {
		//The only bad data I can see being entered here is nothing being entered.
		if(desc.length() > 0) {
			this.description = desc;
		}
		else {
			System.out.println("Please enter a valid description!");
		}
	}
	
	public void setUnitsOnHand(int units) {
		if(units > 0) {
			this.unitsOnHand = units;
		}
		else {
			System.out.println("Please enter a valid integer!");
		}
	}
	public void setPrice(double price) {
		if(price > 0.0) {
			this.price = price;
		}
		else {
			System.out.println("Please enter a valid price!");
		}
	}
	
	public String getDescription() {
		return description;
	}
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	public double getPrice() {
		return price;
	}
	public void readItem(Scanner reader) {
		try {
			//this will totally not be confusing
			this.reader = reader;
			if(reader.hasNext() == true) {
				this.description = reader.next();
				this.unitsOnHand = reader.nextInt();
				this.price = reader.nextDouble();
				reader.nextLine();
			}
			else {
				reader.nextLine();
			}
		}
		
		catch(Exception e){
			
		}
	}
	
	public void writeData(PrintWriter writer) {
		this.writer = writer;
		writer.print(this.description + " " + this.price + " " + this.unitsOnHand);
		writer.close();
	}
}
