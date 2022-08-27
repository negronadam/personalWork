package DesigningClasses;
import Sigma.SigmaNumber;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Scanner;

public class autoScribe extends Application {
	/*AT SOME POINT THIS WILL ALL BE CONSIDERED LEGACY CODE AS THE PROJECT IS MOVED INTO A DIFFERENT CLASS
	 * I Plan on moving this project into a new project called Roster which will be a better and more
	 * Optimized version of autoScribe. It will basically be a new program that contains autoScribe as a
	 * Feature in addition to other features like synced lists.
	 * MOST COMMENTED OUT CODE WILL BE CONSIDERED LEGACY CODE THAT WILL BE REMOVED.
	 * MOST RECENT ADD: LOG BOOK IS ALMOST COMPLETE... ADDING TIME STAMPS AS FINAL TOUCH
	 * 
	 */
	Label title;
	Label label;
	Label copyright;
	Label userLogin;
	Label meanAnswer;
	Button button2;
	Button generate;
	Button addToWp;
	Button logbookCreate;
	Button graphWindowCreate;
	Stage window;
	Scene scene1;
	Scene scene2;
	Button button;
	TableView<Student> table;
	static TextField text;
	public HashMap<Integer, ObservableList<Student>> fireWatchList;
	public ObservableList<Student> permanentWP;
	WorkingPartyGUI wp;
	TextClass lb;
	TestKitGraphWindow gw;
	StudentDatabase database;
	public autoScribe() {
		database = new StudentDatabase();
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
	//Checking to see if everyone has been on working party atleast once.
	public static boolean workingPartyCheck(HashMap<Integer, ObservableList<Student>> roster)
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sigma Main 
		
		launch(args);
		
	}
	//Open the instances.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("The date is: " + cal.getTime());
		Bot bot = new Bot("e45662a5d9388fff7574998ff3");
		
		window = primaryStage;
		primaryStage.setTitle("autoScribe v0.0.1.0a"
				+ "");
		title = new Label("Welcome to autoScribe");
		userLogin = new Label("Please enter a user name!");
		generate = new Button("Generate new working party");
		addToWp = new Button("Add to Working Party");
		/*
		 * TODO in this spot be sure to create some text fields to pass the required
		 * plotting data into. Once this data is aquired pass it into the TestKitGraphWindow class
		 * to correctly generate graph.
		 */
		logbookCreate = new Button("Create new logbook");
		graphWindowCreate = new Button("Create new graph");
		TableColumn<Student, String> xAxis = new TableColumn<>("Name");
		xAxis.setMinWidth(700);
		xAxis.setCellValueFactory(new PropertyValueFactory<>("Name"));
		/*
		TableColumn<Student, String> yAxis = new TableColumn<>("Room");
		yAxis.setMinWidth(700);
		yAxis.setCellValueFactory(new PropertyValueFactory<>("Room"));
		*/
		
		table = new TableView<>();
		table.setItems(database.initializeList());
		table.getColumns().add(xAxis);
		/*table.getColumns().add(yAxis);
		set button functionality. */
		generate.setOnAction(e -> {
			database.workingPartyCheck(database.getRoster());
			if(database.hadWP == true)
			{
				database.resetWorkingParty(database.getRoster());
			}
			
			new WorkingPartyGUI(database.createWorkingParty());
			wp.display();
		});
		logbookCreate.setOnAction(e -> {new TextClass();
		lb.display();});
		graphWindowCreate.setOnAction(e -> {new TestKitGraphWindow();
		gw.create();});
		//addToWp.setOnAction(e -> table.setItems(toString(fireWatchList)));
		meanAnswer = new Label();
		meanAnswer.setText("text");
		text = new TextField("");
		copyright = new Label();
		copyright.setText("© 2022 Adam Negron");
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(text, addToWp, generate, logbookCreate, graphWindowCreate);
		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(title, table, hBox, copyright);
		scene1 = new Scene(vBox, 1280, 720);
		window.setScene(scene1);
		window.show();
		
	}
	
	public void handle(ActionEvent event)
	{
		if(event.getSource() == button)
		{
			System.out.println("You clicked the button!");
		}
	}

}
