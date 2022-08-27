package DesigningClasses;
import java.util.Calendar;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class TextClass {
	/*
	public void textComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.drawString("Test, Test", 5, 175);
		
	}
	*/
	
	private static Stage window;
	private static Calendar cal;
	private static Label text;
	private static Scene scene1;
	private static TableView<Student> table;
	private static ObservableList<Student> list;
	private static ObservableList<Student> roster;
	private static TextField inputRank;
	private static TextField inputName;
	private static TextField inputRoom;
	//Update to add search function.
	private static TextField inputSearch;
	//private static TextField inputTime;
	private static Button add;
	private static Button checkIn;
	//Update to add search function
	private static Button searchCheckin;
	private static ObservableList<Student> students;
	/*
	private static ObservableList<String> names;
	private static ObservableList<String> rooms;
	*/
	public TextClass()
	{
		cal = Calendar.getInstance();
	}
	
	public static void display()
	{
		/*
		try{
		FileWriter fw = new FileWriter("TestDocument.txt");
		fw.write("This is a test save file!");
		fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		*/
		students = FXCollections.observableArrayList();
		/*
		names = FXCollections.observableArrayList();
		rooms = FXCollections.observableArrayList();
		*/
		window = new Stage();
		window.setTitle("LogBook for: " + cal.getTime());
		window.setMinWidth(250);
		list = FXCollections.observableArrayList();
		text = new Label();
		text.setText("Logbook created on " + cal.getTime() + " for PFC NEGRON \n BILLET: SCRIBE");
		//Figure out why list is not updating correctly later.
		inputRank = new TextField();
		inputRank.setMaxWidth(200);
		inputRank.setPromptText("Rank");
		inputName = new TextField();
		inputName.setMaxWidth(200);
		inputName.setPromptText("Name");
		inputRoom = new TextField();
		inputRoom.setMaxWidth(200);
		inputRoom.setPromptText("Room Number");
		inputSearch = new TextField();
		inputSearch.setMaxWidth(200);
		inputSearch.setPromptText("Enter Name");
		/*
		 * TODO: For future updates consider returning a new window with applicable
		 * information about the individual check in/out. Would make it alot more
		 * detailed than this half measure I am implementing in this update.
		 */
		searchCheckin = new Button("Check In");
		//inputTime = new TextField();
		//inputTime.setMaxWidth(200);
		//inputTime.setPromptText("Time");
		add = new Button("Add to List");
		checkIn = new Button("Check-In");
		TableColumn<Student, String> rankColumn = new TableColumn<>("Rank");
		TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
		TableColumn<Student, String> roomColumn = new TableColumn<>("Room");
		TableColumn<Student, String> timeStampOut = new TableColumn<>("Time Out");
		TableColumn<Student, String> timeStampIn = new TableColumn<>("Time In");
		rankColumn.setMinWidth(200);
		rankColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("rank"));
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		roomColumn.setMinWidth(200);
		roomColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("roomNum"));
		timeStampOut.setMinWidth(400);
		timeStampOut.setCellValueFactory(new PropertyValueFactory<Student, String>("timeOut"));
		timeStampIn.setMinWidth(400);
		timeStampIn.setCellValueFactory(new PropertyValueFactory<Student, String>("timeIn"));
		table = new TableView<>();
		//WHEN I GET BACK MAKE SURE TO ADD THE CALENDAR TIME STAMP VALUE TO THE STUDENT OBJECT.
		add.setOnAction(e -> {
			Student student = new Student();
			student.setRank(inputRank.getText());
			student.setName(inputName.getText());
			student.setRoomNum(inputRoom.getText());
			student.setTimeLog();
			table.getItems().addAll(student);
			inputRank.clear();
			inputName.clear();
			inputRoom.clear();
			//inputTime.clear();
		});
		checkIn.setOnAction(e -> {
			ObservableList<Student> selectedStudents, allStudents;
			allStudents = table.getItems();
			selectedStudents = table.getSelectionModel().getSelectedItems();
			for(int a = 0; a < selectedStudents.size(); a++)
			{
				selectedStudents.get(a).setTimeIn();
				table.refresh();
			}
		});
		//table.setItems(names);
		//table.setItems(rooms);
		//table.setItems(getStudents());
		table.getColumns().addAll(rankColumn, nameColumn, roomColumn, timeStampOut, timeStampIn);

		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().add(text);
		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(hBox,table, inputRank, inputName, inputRoom, add, checkIn, inputSearch, searchCheckin);
		scene1 = new Scene(vBox, 1280, 720);
		window.setScene(scene1);
		window.show();
	}
	/*
	public static ObservableList<Student> getStudents()
	{
		ObservableList<Student> students = FXCollections.observableArrayList();
		students.add(new Student("SgtMaj", "Mashak", "420"));
		students.add(new Student("PFC", "Negron", "503"));
		return students;
	}
	*/
	
}
