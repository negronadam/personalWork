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

public class Sigma extends Application {

	Label title;
	Label label;
	Label userLogin;
	Label meanAnswer;
	Button button2;
	Stage window;
	Scene scene1;
	Scene scene2;
	Button button;
	TableView<SigmaNumber> table;
	TextField text;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sigma Main 
		
		launch(args);
		Calendar cal = Calendar.getInstance();
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
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("Sigma");
		title = new Label("Welcome to Sigma!");
		userLogin = new Label("Please enter a user name!");

		TableColumn<SigmaNumber, Double> xAxis = new TableColumn<>("X");
		xAxis.setMinWidth(700);
		xAxis.setCellValueFactory(new PropertyValueFactory<>("x"));
		
		TableColumn<SigmaNumber, Double> yAxis = new TableColumn<>("Y");
		yAxis.setMinWidth(700);
		yAxis.setCellValueFactory(new PropertyValueFactory<>("y"));
		
		table = new TableView<>();
		table.setItems(getNumbers());
		table.getColumns().add(xAxis);
		table.getColumns().add(yAxis);
		meanAnswer = new Label();
		meanAnswer.setText("text");
		text = new TextField("");
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(text);
		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(title, table, hBox);
		scene1 = new Scene(vBox, 1280, 720);
		window.setScene(scene1);
		window.show();
		
	}
	
	public ObservableList<SigmaNumber> getNumbers()
	{
		ObservableList<SigmaNumber> numbers = FXCollections.observableArrayList();
		numbers.add(new SigmaNumber(1,3));
		numbers.add(new SigmaNumber(2,3));
		numbers.add(new SigmaNumber(3,7));
		numbers.add(new SigmaNumber(4,5));
		numbers.add(new SigmaNumber(5,9));
		numbers.add(new SigmaNumber(6,3));
		numbers.add(new SigmaNumber(7,2));
		numbers.add(new SigmaNumber(8,7));
		numbers.add(new SigmaNumber(9,5));
		numbers.add(new SigmaNumber(10,3));
		numbers.add(new SigmaNumber(11,4));
		return numbers;
	}
	
	
	
	public void handle(ActionEvent event)
	{
		if(event.getSource() == button)
		{
			System.out.println("You clicked the button!");
		}
	}
	
	public double getMean(ObservableList<SigmaNumber> list)
	{
		double sum = 0;
		double mean = 0;
		for(int a = 0; a < list.size(); a++)
		{
			sum += list.get(a).getY();
		}
		mean = sum/list.size();
		return mean;
	}

}
