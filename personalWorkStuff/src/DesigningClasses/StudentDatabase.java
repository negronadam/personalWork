package DesigningClasses;
import java.awt.Choice;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
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
import javafx.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentDatabase{
	private ArrayList<Student> permanentWP;
	ObservableList<Student> rm125;
	ObservableList<Student> rm411;
	ObservableList<Student> rm412;
	ObservableList<Student> rm413;
	ObservableList<Student> rm415;
	ObservableList<Student> rm416;
	ObservableList<Student> rm417;
	ObservableList<Student> rm420;
	private ObservableList<Student> rm421;
	private ObservableList<Student> rm422;
	private ObservableList<Student> rm426;
	private ObservableList<Student> rm502;
	private ObservableList<Student> rm503;
	private ObservableList<Student> rm504;
	private ObservableList<Student> rm506;
	private ObservableList<Student> rm507;
	private ObservableList<Student> rm508;
	private ObservableList<Student> rm509;
	private ObservableList<Student> rm510;
	private ObservableList<Student> rm511;
	private ObservableList<Student> rm516;
	private ObservableList<Student> rm520;
	private ObservableList<Student> rm521;
	private ObservableList<Student> rm522;
	private ObservableList<Student> rm523;
	private ObservableList<Student> rm524;
	private ObservableList<Student> rm525;
	private ObservableList<Student> rm526;
	private ObservableList<Student> rm527;
	private ObservableList<Student> rm528;
	private ObservableList<Student> rm529;
	private ObservableList<Student> rm530;
	boolean hadWP;
	public HashMap<Integer, ObservableList<Student>> fireWatchRoster;
	public StudentDatabase()
	{
		rm125 = FXCollections.observableArrayList();
		rm125.add(new Student("Vigil", 125, 0, false, false, false, false));
		rm125.add(new Student("Wickline", 125, 0, false, false, false, false));
		rm411 = FXCollections.observableArrayList();
		rm411.add(new Student("Clark", 125, 0, false, false, false, false));
		rm411.add(new Student("Raymond", 125, 0, false, false, false, false));
		rm411.add(new Student("Velasco", 125, 0, false, false, false, false));
		rm412 = FXCollections.observableArrayList();
		rm412.add(new Student("Newman", 125, 0, false, false, false, false));
		rm412.add(new Student("Rodriguez", 125, 0, false, false, false, false));
		rm412.add(new Student("Todd", 125, 0, false, false, false, false));
		rm413 = FXCollections.observableArrayList();
		rm413.add(new Student("Flood", 125, 0, false, false, false, false));
		rm413.add(new Student("Luna", 125, 0, false, false, false, false));
		rm413.add(new Student("Spirnock", 125, 0, false, false, false, false));
		rm415 = FXCollections.observableArrayList();
		rm415.add(new Student("Fonesca", 125, 0, false, false, false, false));
		rm415.add(new Student("Thompson", 125, 0, false, false, false, false));
		rm416 = FXCollections.observableArrayList();
		rm416.add(new Student("Diazrojas", 125, 0, false, false, false, false));
		rm416.add(new Student("HernandezRamirez", 125, 0, false, false, false, false));
		rm416.add(new Student("PozoSanchez", 125, 0, false, false, false, false));
		rm417 = FXCollections.observableArrayList();
		rm417.add(new Student("Kleiner", 125, 0, false, false, false, false));
		rm417.add(new Student("Perry", 125, 0, false, false, false, false));
		rm420 = FXCollections.observableArrayList();
		rm420.add(new Student("Bartolomeo", 125, 0, false, false, false, false));
		rm420.add(new Student("Lampkin", 125, 0, false, false, false, false));
		rm421 = FXCollections.observableArrayList();
		rm421.add(new Student("Griffith", 125, 0, false, false, false, false));
		rm422 = FXCollections.observableArrayList();
		rm422.add(new Student("Flaughter", 125, 0, false, false, false, false));
		rm422.add(new Student("NunezDelgato", 125, 0, false, false, false, false));
		rm426 = FXCollections.observableArrayList();
		rm426.add(new Student("Walcott", 125, 0, false, false, false, false));
		rm502 = FXCollections.observableArrayList();
		rm502.add(new Student("Jeffries", 125, 0, false, false, false, true));
		rm502.add(new Student("Whitman", 125, 0, false, false, false, true));
		rm502.add(new Student("Thelusca", 125, 0, false, false, false, true));
		rm503 = FXCollections.observableArrayList();
		rm503.add(new Student("Romo", 125, 0, false, false, false, true));
		rm503.add(new Student("Reyes", 125, 0, false, false, false, true));
		rm503.add(new Student("Negron", 125, 0, false, false, false, true));
		rm504 = FXCollections.observableArrayList();
		rm506 = FXCollections.observableArrayList();
		rm507 = FXCollections.observableArrayList();
		rm508 = FXCollections.observableArrayList();
		rm508.add(new Student("Wilkes", 125, 0, false, false, true, false));
		rm509 = FXCollections.observableArrayList();
		rm510 = FXCollections.observableArrayList();
		rm511 = FXCollections.observableArrayList();
		rm516 = FXCollections.observableArrayList();
		rm516.add(new Student("AnzoraVasquez", 125, 0, false, false, false, false));
		rm520 = FXCollections.observableArrayList();
		rm520.add(new Student("Deskins", 125, 0, false, false, false, false));
		rm520.add(new Student("Dominguez", 125, 0, false, false, false, false));
		rm520.add(new Student("Rowe", 125, 0, false, false, false, false));
		rm521 = FXCollections.observableArrayList();
		rm521.add(new Student("Alonzo", 125, 0, false, false, false, false));
		rm521.add(new Student("HernandezLopez", 125, 0, false, false, false, false));
		rm521.add(new Student("Lascano", 125, 0, false, false, false, false));
		rm522 = FXCollections.observableArrayList();
		rm522.add(new Student("Shendler", 125, 0, false, false, false, false));
		rm522.add(new Student("Avalos", 125, 0, false, false, false, false));
		rm523 = FXCollections.observableArrayList();
		rm523.add(new Student("McGovern", 125, 0, false, false, false, false));
		rm523.add(new Student("Myers", 125, 0, false, false, false, false));
		rm524 = FXCollections.observableArrayList();
		rm524.add(new Student("Bryden", 125, 0, false, false, false, false));
		rm525 = FXCollections.observableArrayList();
		rm525.add(new Student("Daubenspeck", 125, 0, false, false, false, false));
		rm525.add(new Student("Lopez", 125, 0, false, false, false, false));
		rm526 = FXCollections.observableArrayList();
		rm526.add(new Student("Yvey", 125, 0, false, false, false, false));
		rm526.add(new Student("Cook", 125, 0, false, false, false, false));
		rm526.add(new Student("Krikorian", 125, 0, false, false, false, false));
		rm527 = FXCollections.observableArrayList();
		rm527.add(new Student("Gamoneda", 125, 0, false, false, false, false));
		rm527.add(new Student("Walter", 125, 0, false, false, false, false));
		rm528 = FXCollections.observableArrayList();
		rm528.add(new Student("Denison", 125, 0, false, false, false, false));
		rm528.add(new Student("Fabbrini", 125, 0, false, false, false, false));
		rm528.add(new Student("Smith", 125, 0, false, false, false, false));
		rm529 = FXCollections.observableArrayList();
		rm529.add(new Student("Hernandez", 125, 0, false, false, false, false));
		rm529.add(new Student("Ramirez", 125, 0, false, false, false, false));
		rm529.add(new Student("Knicker", 125, 0, false, false, false, false));
		rm530 = FXCollections.observableArrayList();
		rm530.add(new Student("Miguellorenzo", 125, 0, false, false, false, false));
		rm530.add(new Student("Wagner", 125, 0, false, false, false, false));
		rm530.add(new Student("Swords", 125, 0, false, false, false, false));
		fireWatchRoster = new HashMap<Integer, ObservableList<Student>>();
		fireWatchRoster.put(125, rm125);
		fireWatchRoster.put(411, rm411);
		fireWatchRoster.put(412, rm412);
		fireWatchRoster.put(413, rm413);
		fireWatchRoster.put(415, rm415);
		fireWatchRoster.put(416, rm416);
		fireWatchRoster.put(417, rm417);
		fireWatchRoster.put(420, rm420);
		fireWatchRoster.put(421, rm421);
		fireWatchRoster.put(422, rm422);
		fireWatchRoster.put(426, rm426);
		fireWatchRoster.put(503, rm503);
		fireWatchRoster.put(508, rm508);
		fireWatchRoster.put(520, rm520);
		fireWatchRoster.put(521, rm521);
		fireWatchRoster.put(522, rm522);
		fireWatchRoster.put(523, rm523);
		fireWatchRoster.put(524, rm524);
		fireWatchRoster.put(525, rm525);
		fireWatchRoster.put(526, rm526);
		fireWatchRoster.put(527, rm527);
		fireWatchRoster.put(528, rm528);
		fireWatchRoster.put(529, rm529);
		fireWatchRoster.put(530, rm530);
	}
	public StudentDatabase(String xName)
	{
		/*
			name = xName;
			ArrayList<Student> name = new ArrayList<Student>();
		*/
		//USe this class to test out algorithm for making FireWatch
	}
	
	public HashMap<Integer, ObservableList<Student>> getRoster()
	{
		HashMap<Integer, ObservableList<Student>> list = new HashMap<Integer, ObservableList<Student>>();
		list = this.fireWatchRoster;
		return list;
	}
	
	public ObservableList<Student> initializeList()
	{
		ObservableList<Student> students = FXCollections.observableArrayList();
		for(int a : fireWatchRoster.keySet())
		{
			for(int b = 0; b < fireWatchRoster.get(a).size(); b++)
			{
				//This is where I left off.
				students.add((Student)fireWatchRoster.get(a).get(b));
			}
		}
		return students;
	}
	
	public static void resetWorkingParty(HashMap<Integer, ObservableList<Student>> roster)
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
	
	public void workingPartyCheck(HashMap<Integer, ObservableList<Student>> roster)
	{
		int numHadWorkingParty = 0;
		int rosterSize = roster.size();
		for(int a : roster.keySet())
		{
			for(int b = 0; b < roster.get(a).size(); b++)
			{
				if(roster.get(a).get(b).hadWorkingParty() == true)
				{
					numHadWorkingParty++;
				}
			}
		}
		if(numHadWorkingParty == rosterSize)
		{
			hadWP = false;
		}
	}
	public void getWPStatus()
	{
		
	}
	//I don't know where the flaw in my thinking is here.
	public ObservableList<Student> createWorkingParty()
	{
		int numNeeded = 15;
		ObservableList<Student> wParty = FXCollections.observableArrayList();
		//adding permamenent working party before picking names from the list.
		// Iterating through the roster hashmap that was passed into the method.
			//HashMap<Integer, ObservableList> roster = fireWatchRoster;
		for(int a : fireWatchRoster.keySet())
				if(wParty.size() <= numNeeded - 1) {
			{
				for(int b = 0; b < fireWatchRoster.get(a).size(); b++)
				{
					if((((Student) fireWatchRoster.get(a).get(b)).hadWorkingParty() == false))
					{
							//roster.get(a).get(b).setWorkingParty(true);
							//roster.get(a).get(b).addTimeLog();
							wParty.add((Student) fireWatchRoster.get(a).get(b));
							((Student) fireWatchRoster.get(a).get(b)).setWorkingParty(true);
					}
				}
			}
		
		}
		return wParty;
	}
	/*
	public ObservableList<Student> initializeList()
	{
		ObservableList<Student> students = FXCollections.observableArrayList();
		for(int a : fireWatchRoster.keySet())
		{
			for(int b = 0; b < fireWatchRoster.get(a).size(); b++)
			{
				//This is where I left off.
				students.add((Student)fireWatchRoster.get(a).get(b));
			}
		}
		return students;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args)
	{
		//WorkingPartyGUI wp1 = new WorkingPartyGUI();
		launch(args);
		/*JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JButton button = new JButton();
		Container c = frame.getContentPane();
		FlowLayout flow = new FlowLayout();
		button.addActionListener(e -> wp1.start());
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
		/*Calendar cal = Calendar.getInstance();
		System.out.println("The date is: " + cal.getTime());
		Bot bot = new Bot("e45662a5d9388fff7574998ff3");
		ArrayList<Student> rm125 = new ArrayList<Student>();
		rm125.add(new Student("Vigil", 125, 0, false, false, false, false));
		ArrayList<Student> rm411 = new ArrayList<Student>();
		rm411.add(new Student("Velasco", 411, 0, false, false, false ,false));
		ArrayList<Student> rm412 = new ArrayList<Student>();
		ArrayList<Student> rm413 = new ArrayList<Student>();
		rm413.add(new Student("Spirnock", 413, 0, false, false, false ,false));
		rm413.add(new Student("Flood", 413, 0, false, false, false, false));
		ArrayList<Student> rm415 = new ArrayList<Student>();
		ArrayList<Student> rm416 = new ArrayList<Student>();
		ArrayList<Student> rm417 = new ArrayList<Student>();
		ArrayList<Student> rm420 = new ArrayList<Student>();
		rm420.add(new Student("Bartolomeo", 420, 0, false, false, false, false));
		ArrayList<Student> rm421 = new ArrayList<Student>();
		ArrayList<Student> rm422 = new ArrayList<Student>();
		ArrayList<Student> rm426 = new ArrayList<Student>();
		ArrayList<Student> rm502 = new ArrayList<Student>();
		rm502.add(new Student("Jefferies", 502, 0, false, true, false, true));
		rm502.add(new Student("Thelusca", 502, 0, false, true, false, true));
		rm502.add(new Student("Whitman", 502, 0, false, true, false, true));
		ArrayList<Student> rm503 = new ArrayList<Student>();
		rm503.add(new Student("Negron", 503, 0, false, false, false, false));
		rm503.add(new Student("Reyes", 503, 0, false, false, false, true));
		rm503.add(new Student("Romo", 503, 0, false, false, false, true));
		ArrayList<Student> rm504 = new ArrayList<Student>();
		rm504.add(new Student("Cissell", 504, 0, false, false, false, true));
		rm504.add(new Student("Davis", 504, 0, false, false, false, true));
		rm504.add(new Student("RivasLopez", 504, 0, false, false, false, true));
		ArrayList<Student> rm505 = new ArrayList<Student>();
		rm505.add(new Student("Connor", 505, 0, false, false, false, false));
		rm505.add(new Student("Steffer", 505, 0, false, false, false, false));
		rm505.add(new Student("Johnson", 505, 0, false, false, false, false));
		ArrayList<Student> rm506 = new ArrayList<Student>();
		rm506.add(new Student("Holiman", 506, 0, false, false, false, false));
		rm506.add(new Student("August", 506, 0, false, false, false, false));
		rm506.add(new Student("Roary", 506, 0, false, false, false, false));
		ArrayList<Student> rm507 = new ArrayList<Student>();
		rm507.add(new Student("TestPlaceholder", 507, 0, false, false, false, false));
		rm507.add(new Student("Kennedy", 507, 0, false, false, false, false));
		rm507.add(new Student("Human", 507, 0, false, false, false, false));
		ArrayList<Student> rm508 = new ArrayList<Student>();
		rm508.add(new Student("Human2", 508, 0, false, false, false, false));
		rm508.add(new Student("AnotherHuman", 508, 0, false, false, false, false));
		rm508.add(new Student("MorHumans", 508, 0, false, false, false, false));
		ArrayList<Student> rm509 = new ArrayList<Student>();
		rm509.add(new Student("Marsh", 509, 0, false, false, false, false));
		rm509.add(new Student("Xavier", 509, 0, false, false, false, false));
		rm509.add(new Student("Asher", 509, 0, false, false, false, false));
		ArrayList<Student> rm510 = new ArrayList<Student>();
		rm510.add(new Student("King", 510, 0, false, false, false, false));
		rm510.add(new Student("Cabrera", 510, 0, false, false, false, true));
		rm510.add(new Student("Haiflich", 510, 0, false, false, false, true));
		ArrayList<Student> rm511 = new ArrayList<Student>();
		rm511.add(new Student("Stafford", 511, 0, false, false, false, true));
		rm511.add(new Student("Quitner", 511, 0, false, false, false, true));
		rm511.add(new Student("Wagner", 511, 0, false, false, false, true));
		ArrayList<Student> rm516 = new ArrayList<Student>();
		ArrayList<Student> rm520 = new ArrayList<Student>();
		ArrayList<Student> rm521 = new ArrayList<Student>();
		ArrayList<Student> rm522 = new ArrayList<Student>();
		ArrayList<Student> rm523 = new ArrayList<Student>();
		rm523.add(new Student("McGovern", 523, 0, false, false , false, false));
		ArrayList<Student> rm524 = new ArrayList<Student>();
		ArrayList<Student> rm525 = new ArrayList<Student>();
		ArrayList<Student> rm526 = new ArrayList<Student>();
		ArrayList<Student> rm527 = new ArrayList<Student>();
		ArrayList<Student> rm528 = new ArrayList<Student>();
		ArrayList<Student> rm529 = new ArrayList<Student>();
		ArrayList<Student> rm530 = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		HashMap <Integer, ArrayList<Student>> fireWatchList = new HashMap<Integer, ArrayList<Student>>();
		fireWatchList.put(125, rm125);
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
		
		ArrayList<Student> permanentWP = new ArrayList<Student>();
		permanentWP.add(rm411.get(0));
		permanentWP.add(rm413.get(0));
		permanentWP.add(rm413.get(1));
		permanentWP.add(rm420.get(0));
		permanentWP.add(rm523.get(0));
		
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
					/*
					System.out.println("Welcome to AutoScribe!");
					System.out.println("====================Main Menu====================");
					System.out.println("1. Generate new FireWatch Roster");
					System.out.println("2.Generate new working party");
					System.out.println("3.Search for student");
					System.out.println("4.Search for roster");
					*/
					/*frame.setSize(500, 500);
					
					c.setLayout(flow);
					label.setText("Welcome to AutoScribe");
					button.setText("Generate new working party!");
					c.add(label);
					c.add(button);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					*/
					/*
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
			*/
	//}
	/*

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		text = new TextField("");
		table = new TableView<>();
		window = primaryStage;
		primaryStage.setTitle("Sigma");
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(title, table, hBox);
		scene1 = new Scene(vBox, 1280, 720);
		window.setScene(scene1);
		window.show();
	}
	*/
	}
