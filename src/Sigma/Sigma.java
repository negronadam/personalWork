package Sigma;
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
		meanAnswer.setText();
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
