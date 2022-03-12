package DesigningClasses;
import java.util.ArrayList;
import java.util.Scanner;
public class ClassSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students1 = new ArrayList<Student>();
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		Scanner input = new Scanner(System.in);
		boolean programIsRunning = true;
		boolean addingStudents = false;
		boolean removingStudents = false;
		boolean sortingStudents = false;
		boolean nameFound = false;
		int menuChoice = 999;
			while(programIsRunning)
			{
				System.out.println("What would you like to do?");
				System.out.println("1. Add Students");
				System.out.println("2. Remove Students");
				System.out.println("3. Sort students into classes");
				System.out.println("4. Show student list");
				menuChoice = input.nextInt();
				switch(menuChoice)
				{
					case 1:
							addingStudents = true;
							System.out.println("How many students would you like to add?");
							int numStudents = input.nextInt();
							for(int a = 0; a < numStudents; a++)
							{
								System.out.println("What is thier name?");
								input.nextLine();
								String name = input.nextLine();
								System.out.println("What is thier age?");
								int age = input.nextInt();
								System.out.println("What grade are they in? (Use grade level numbers)");
								int grade = input.nextInt();
								students1.add(new Student(name, age, grade));
								System.out.println(students1.get(a).getName() + " has been added to the student list!");
							}
					break;
					
					case 2:
							System.out.println("How many students would you like to remove?");
							int numStudentsRemove = input.nextInt();
							for(int a = 0; a < numStudentsRemove; a++)
							{
								System.out.println("What is the name of the student you would like to remove?");
								input.nextLine();
								String studentName = input.nextLine();
								for(int x = 0; x < students1.size(); x++)
								{
									if(students1.get(a).getName().equals(studentName))
									{
										students1.remove(a);
										System.out.println(studentName + " has been removed from the student list!");
										nameFound = true;
										
									}
									else if(nameFound == false)
									{
										System.out.println("We could not find that name!");
									}
									
								}
							}
							
						
					break;
					
					case 3:
						
					break;
					
					
					case 4:
						for(int a = 0; a < students1.size(); a++)
						{
							System.out.println(students1.get(a).getName());
						}
					break;
				}
				
				
				/*
				while(addingStudents)
				{
					System.out.println("You chose to add a student");
					input.nextLine();
					System.out.println("Press 0 to go back to the main menu");
					int menu = input.nextInt();
					if(menu == 0)
					{
						addingStudents = false;
					}
				}
				
				while (removingStudents)
				{
					
				}
				
				while(sortingStudents)
				{
					
				}
				*/
			}
		}

}
