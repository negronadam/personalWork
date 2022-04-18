package DesigningClasses;
import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class StudentDatabase {
	private String name;
	public StudentDatabase(String xName)
	{
		/*
			name = xName;
			ArrayList<Student> name = new ArrayList<Student>();
		*/
		//USe this class to test out algorithm for making FireWatch
	}
	
	public static void main(String[] args)
	{
		/*God help me if this is how I write my program...
		 * This will all probably be moved to a separate class to 
		 * make the program more neat and efficient.
		 * In the future I will implement use of a tree to make multiple floors possible
		 * as efficiently as possible.
		 */
		ArrayList<Student> rm502 = new ArrayList<Student>();
		rm502.add(new Student("Jefferies", 502, 0, false));
		rm502.add(new Student("Thelusca", 502, 0, false));
		rm502.add(new Student("Whitman", 502, 0, false));
		ArrayList<Student> rm503 = new ArrayList<Student>();
		rm503.add(new Student("Negron", 502, 0, false));
		rm503.add(new Student("Reyes", 502, 0, false));
		rm503.add(new Student("Romo", 502, 0, false));
		ArrayList<Student> rm504 = new ArrayList<Student>();
		rm504.add(new Student("Cissell", 502, 0, false));
		rm504.add(new Student("Davis", 502, 0, false));
		rm504.add(new Student("RivasLopez", 502, 0, false));
		ArrayList<Student> rm505 = new ArrayList<Student>();
		rm505.add(new Student("Connor", 502, 0, false));
		rm505.add(new Student("Steffer", 502, 0, false));
		rm505.add(new Student("Johnson", 502, 0, false));
		ArrayList<Student> rm506 = new ArrayList<Student>();
		rm506.add(new Student("Holiman", 502, 0, false));
		rm506.add(new Student("August", 502, 0, false));
		rm506.add(new Student("Roary", 502, 0, false));
		ArrayList<Student> rm507 = new ArrayList<Student>();
		rm507.add(new Student("TestPlaceholder", 502, 0, false));
		rm507.add(new Student("Kennedy", 502, 0, false));
		rm507.add(new Student("Human", 502, 0, false));
		ArrayList<Student> rm508 = new ArrayList<Student>();
		rm508.add(new Student("Human2", 502, 0, false));
		rm508.add(new Student("JAnotherHuman", 502, 0, false));
		rm508.add(new Student("MorHumans", 502, 0, false));
		Scanner input = new Scanner(System.in);
		HashMap <Integer, ArrayList<Student>> fireWatchList = new HashMap<Integer, ArrayList<Student>>();
		fireWatchList.put(502, rm502);
		fireWatchList.put(503, rm503);
		fireWatchList.put(504, rm504);
		fireWatchList.put(505, rm505);
		fireWatchList.put(506, rm506);
		fireWatchList.put(507, rm507);
		fireWatchList.put(508, rm508);
		
		boolean enterWatch = true;
		System.out.println("Would you like to add a new name to the roster?");
		/*
		while(enterWatch = true)
		{
			System.out.println("What is the name?");
			String name = input.nextLine();
			System.out.println("What room number are they?");w
			int roomNum = input.nextInt();
			boolean hadWatch = false;
			int grade = 0;
			fireWatchList.put(roomNum, new Student(name, roomNum, grade, hadWatch));
			System.out.println("Would you like to add another to the list?");
			String choice = input.nextLine();
			if(choice == "n")
			{
				enterWatch = false;
			}
			*/
			
			for(int a : fireWatchList.keySet())
			{
				System.out.println("Rm: " + a + " Name:" + fireWatchList.get(a));
			}
				
		//}
	}
	
}
