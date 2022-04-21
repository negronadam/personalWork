package DesigningClasses;
import java.awt.Choice;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Calendar;
import javax.swing.*;

public class StudentDatabase {
	private String name;
	private JButton button;
	public StudentDatabase(String xName)
	{
		/*
			name = xName;
			ArrayList<Student> name = new ArrayList<Student>();
		*/
		//USe this class to test out algorithm for making FireWatch
	}
	
	public static void resetWorkingParty(HashMap<Integer, ArrayList<Student>> roster)
	{
		for(int a : roster.keySet())
		{
			for(int b = 0; b < roster.get(a).size(); b++)
			{
				if(roster.get(a).get(b).hadWorkingParty() == true)
				{
					roster.get(a).get(b).setWorkingParty(false);
				}
			}
		}
	}
	
	public static boolean workingPartyCheck(HashMap<Integer, ArrayList<Student>> roster)
	{
		int numHadWorkingParty = 0;
		int rosterSize = 0;
		for(int a : roster.keySet())
		{
			for(int b = 0; b < roster.get(a).size(); b++)
			{
				if(roster.get(a).get(b).hadWorkingParty() == true)
				{
					numHadWorkingParty++;
				}
				rosterSize++;
			}
		}
		if(numHadWorkingParty == rosterSize);
		{
			return true;
		}
	}
	
	public static ArrayList<Student> createWorkingParty(HashMap<Integer, ArrayList<Student>> roster)
	{
		int numNeeded = 20;
		ArrayList<Student> wParty = new ArrayList<Student>();
		// Iterating through the roster hashmap that was passed into the method.
			for(int a : roster.keySet())
				if(wParty.size() <= numNeeded - 1) {
			{
				for(int b = 0; b < roster.get(a).size(); b++)
				{
					if(roster.get(a).get(b).hadWorkingParty() == false && roster.get(a).get(b).hasAppointment() == false)
					{
							roster.get(a).get(b).setWorkingParty(true);
							wParty.add(roster.get(a).get(b));
					}
				}
			}
		
		}
		return wParty;
	}
	
	public void setUpButtonListeners()
	{
		ActionListener buttonListner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object o = ae.getSource();
				if(o == button)
				{
					
				}
			}

		};
	}
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JButton button = new JButton();
		Container c = frame.getContentPane();
		FlowLayout flow = new FlowLayout();
		frame.setTitle("AutoScribe v1.0");
		/*God help me if this is how I write my program...
		 * This will all probably be moved to a separate class to 
		 * make the program more neat and efficient.
		 * In the future I will implement use of a tree to make multiple floors possible
		 * as efficiently as possible.
		 * Things I got done today: (20220420)
		 * -Added log system where each Student stores an ArrayList of every time they received Working party.
		 * TODO Begin using the 
		 */
		Calendar cal = Calendar.getInstance();
		System.out.println("The date is: " + cal.getTime());
		Bot bot = new Bot("e45662a5d9388fff7574998ff3");
		ArrayList<Student> rm502 = new ArrayList<Student>();
		rm502.add(new Student("Jefferies", 502, 0, false, true, false));
		rm502.add(new Student("Thelusca", 502, 0, false, true, false));
		rm502.add(new Student("Whitman", 502, 0, false, true, false));
		ArrayList<Student> rm503 = new ArrayList<Student>();
		rm503.add(new Student("Negron", 503, 0, false, false, false));
		rm503.add(new Student("Reyes", 503, 0, false, false, false));
		rm503.add(new Student("Romo", 503, 0, false, false, false));
		ArrayList<Student> rm504 = new ArrayList<Student>();
		rm504.add(new Student("Cissell", 504, 0, false, false, false));
		rm504.add(new Student("Davis", 504, 0, false, false, false));
		rm504.add(new Student("RivasLopez", 504, 0, false, false, false));
		ArrayList<Student> rm505 = new ArrayList<Student>();
		rm505.add(new Student("Connor", 505, 0, false, false, false));
		rm505.add(new Student("Steffer", 505, 0, false, false, false));
		rm505.add(new Student("Johnson", 505, 0, false, false, false));
		ArrayList<Student> rm506 = new ArrayList<Student>();
		rm506.add(new Student("Holiman", 506, 0, false, false, false));
		rm506.add(new Student("August", 506, 0, false, false, false));
		rm506.add(new Student("Roary", 506, 0, false, false, false));
		ArrayList<Student> rm507 = new ArrayList<Student>();
		rm507.add(new Student("TestPlaceholder", 507, 0, false, false, false));
		rm507.add(new Student("Kennedy", 507, 0, false, false, false));
		rm507.add(new Student("Human", 507, 0, false, false, false));
		ArrayList<Student> rm508 = new ArrayList<Student>();
		rm508.add(new Student("Human2", 508, 0, false, false, false));
		rm508.add(new Student("AnotherHuman", 508, 0, false, false, false));
		rm508.add(new Student("MorHumans", 508, 0, false, false, false));
		ArrayList<Student> rm509 = new ArrayList<Student>();
		rm509.add(new Student("Marsh", 509, 0, false, false, false));
		rm509.add(new Student("Xavier", 509, 0, false, false, false));
		rm509.add(new Student("Asher", 509, 0, false, false, false));
		ArrayList<Student> rm510 = new ArrayList<Student>();
		rm510.add(new Student("King", 510, 0, false, false, false));
		rm510.add(new Student("Cabrera", 510, 0, false, false, false));
		rm510.add(new Student("Haiflich", 510, 0, false, false, false));
		ArrayList<Student> rm511 = new ArrayList<Student>();
		rm511.add(new Student("Stafford", 511, 0, false, false, false));
		rm511.add(new Student("Quitner", 511, 0, false, false, false));
		rm511.add(new Student("Wagner", 511, 0, false, false, false));
		Scanner input = new Scanner(System.in);
		HashMap <Integer, ArrayList<Student>> fireWatchList = new HashMap<Integer, ArrayList<Student>>();
		fireWatchList.put(502, rm502);
		fireWatchList.put(503, rm503);
		fireWatchList.put(504, rm504);
		fireWatchList.put(505, rm505);
		fireWatchList.put(506, rm506);
		fireWatchList.put(507, rm507);
		fireWatchList.put(508, rm508);
		fireWatchList.put(509, rm509);
		fireWatchList.put(510, rm510);
		fireWatchList.put(511, rm511);
		
		boolean enterWatch = true;
		boolean programRunning = true;
		System.out.println("Would you like to add a new name to the roster?");
			while(programRunning = true)
				{
				// Algorithm for iterating through fireWatchList hashmap.
					for(int a : fireWatchList.keySet())
					{
						for(int b = 0; b < fireWatchList.get(a).size(); b++)
						{
							System.out.println("Rm:" + a + " Name:" + fireWatchList.get(a).get(b).getName());
						}
					}
					//Test using the createWorkingParty function.
					
					/*ArrayList<Student> wParty = createWorkingParty(fireWatchList);
					for(int a = 0; a < wParty.size(); a++)
					{
						System.out.println(wParty.get(a).getName());
					}*/
					//Test algorithm. remove after
					System.out.println("Welcome to AutoScribe!");
					System.out.println("====================Main Menu====================");
					System.out.println("1. Generate new FireWatch Roster");
					System.out.println("2.Generate new working party");
					System.out.println("3.Search for student");
					System.out.println("4.Search for roster");
					
					frame.setSize(500, 500);
					
					c.setLayout(flow);
					label.setText("Welcome to AutoScribe");
					button.setText("Generate new working party!");
					c.add(label);
					c.add(button);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					int choice = input.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("This feature is under construction!");
						break;
						
					case 2:
						//TODO Do this choice next.
						break;
						
					case 3:
						System.out.println("Please enter thier name: ");
						//clearing the input buffer 
						input.nextLine();
						String name = input.nextLine();
						for(int a : fireWatchList.keySet())
						{
							//for(int a = 0; a <)
						}
						break;
						
					case 4:
						//Add this functionality later
						break;
						
					default:
						System.out.println("I do not recognize that command...");
						break;
					}
					System.out.println("End of Program (enter 'a' key to terminate)");
					if(input.nextLine() == "a")
					{
						programRunning = false;
						break;
					}
				}
			System.out.println("Program Terminated");
			input.close();
	}
	
}
