package DesigningClasses;
import java.util.Scanner;
import java.util.ArrayList;
public class FileSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<FileSystem> fs = new ArrayList<FileSystem>();
		boolean programIsRunning = true;
		int menuChoice;
		System.out.println("1. Please enter a choice: ");
		System.out.println("2. Add a new file system");
		System.out.println("3. Add new file");
		System.out.println("4. Delete a file system");
		System.out.println("5. Format a file system");
		System.out.println("6. Quit");
		menuChoice = input.nextInt();
		while(programIsRunning)
		{
			switch(menuChoice)
			{
				case 1: 
					System.out.println("What will the name of the file system be?");
					String name = input.nextLine();
					System.out.println("How much space do you want to put on the file system?");
					int space = input.nextInt();
					System.out.println("Is this correct? Name: " + name + " and file size: " + space + " ?");
					boolean answer = input.nextBoolean();
					if(answer == true)
					{
						fs.add(new FileSystem(name, space));
					}
					else
					{
						System.out.println("What is the name");
						name = input.nextLine();
						System.out.println("how much space is on it?");
						space = input.nextLine();
						fs.add(new FileSystem(name, space));
					}
					break; 
			}
		}
		
		
	}

}
