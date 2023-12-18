package DesigningClasses;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.Calendar;
public class HardDriveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		HashMap<Integer, String> rooms = new HashMap<Integer, String>();
		Calendar cal = Calendar.getInstance();
		rooms.put(1, new String("Jim, John, Bill"));
		rooms.put(2, new String("Jim, Bob, Halfney"));
		boolean programRunning = true;
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write("Hotel Roster for: " + cal.getTime() + "\n");
		for(int a : rooms.keySet()) {
			writer.write(a + " " + rooms.get(a) + "\n");
		}
		writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("File written!");
		System.out.println("Write a new Save file?");
		while(programRunning) {
			System.out.println("Read from file?");
			char choice = input.nextLine().charAt(0);
			if(choice == 'y') {
				try {
					BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
					System.out.println(reader.readLine());
					reader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}else {
				programRunning = false;
			}
		}
		input.close();
		//Fix this stuff later.
		/*
		Scanner input = new Scanner(System.in);
		int menuChoice = 0;
		boolean programIsRunning = true;
		System.out.println("Welcome to Adam Negron's Hard Drive Tool");
		System.out.println("What is the name of the Hard Drive?");
		String hddName = input.nextLine();
		System.out.println("How much space is on the Hard Drive");
		double spaceOnHdd = input.nextDouble();
		for(int i = 0; i < 100; i++)
		{
			System.out.println("");
		}
		while(programIsRunning = true)
		{
			HardDrive hdd = new HardDrive(hddName, spaceOnHdd);
			System.out.println("Please choose a choice from the menu!");
			System.out.println("1. Add files");
			System.out.println("2. Delete files");
			System.out.println("3. Check if the Hard Drive is full");
			System.out.println("4. Check if the Hard Drive is empty");
			System.out.println("5. List the files on the Hard Drive");
			System.out.println("6. Exit the program");
			menuChoice = input.nextInt();
			switch(menuChoice)
			{
			
			case 1: System.out.println("How much are the files to add in MB?");
			double fileSize = input.nextInt();
			hdd.addFile(fileSize);
				
			break;
			
			case 2:System.out.println("What index on the hard drive is the file located on?");
			int indexLocation = input.nextInt();
			hdd.deleteFile(indexLocation);
			
			break;
			
			case 3: hdd.isFull();
			
			break;
			
			case 4: hdd.isEmpty();
			
			break;
			
			case 5:System.out.println("File Sizes on Hard Drive:" + hddName);
				hdd.checkHardDrive();
			break;
			
			case 6: programIsRunning = false;
			
			break;
			
			}
		}
		*/
	}

}
