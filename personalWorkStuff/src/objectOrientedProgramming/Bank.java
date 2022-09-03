package objectOrientedProgramming;
import javafx.application.Application;
import javafx.collections.FXCollections;
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

public class Bank extends Application implements EventHandler<ActionEvent> {
	Label title;
	Label label;
	Label label2;
	Label checkingAccTitle;
	Button button2;
	Stage window;
	Stage checkingWindow;
	Stage error2;
	Scene scene1;
	Scene scene2;
	Scene error1;
	Button button;
	Button makeChecking;
	TableView<BankChecking> table;
	TextField nameInput, checkingInput, iDInput;
	boolean showError1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("Bank");
		
		title = new Label("Welcome to Adam Negron's Banking Software!");
		checkingAccTitle = new Label("Checking Accounts:");
		
		//Name column
		TableColumn<BankChecking, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//Price column
		TableColumn<BankChecking, Double> balanceColumn = new TableColumn<>("Balance");
		balanceColumn.setMinWidth(100);
		balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));
		
		//Account ID column
		TableColumn<BankChecking, Integer> iDColumn = new TableColumn<>("AccountID");
		iDColumn.setMinWidth(100);
		iDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		//Creating the tables
		table = new TableView<>();
		table.setItems(getCheckingAcc());
		table.getColumns().add(nameColumn);
		table.getColumns().add(balanceColumn);
		table.getColumns().add(iDColumn);
		
		//Name input
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		
		
		//Checking input
		checkingInput = new TextField();
		checkingInput.setPromptText("Balance");
		
		//iD input
		iDInput = new TextField();
		iDInput.setPromptText("Account ID");
		 
		//Add button
		Button addButton = new Button("Add");
		addButton.setOnAction(e -> addButtonClicked());
		
		//Remove button
		Button removeButton = new Button("Remove");
		
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput, checkingInput, iDInput, addButton, removeButton);
		VBox vBox = new VBox();
		vBox.getChildren().addAll(title, checkingAccTitle, table, hBox);
		scene1 = new Scene(vBox);
		window.setScene(scene1);
		window.show();
		
	}
	
	public ObservableList<BankChecking> getCheckingAcc()
	{
		ObservableList<BankChecking> checkings = FXCollections.observableArrayList();
		checkings.add(new BankChecking("Checkings1", 500.00, 1));
		checkings.add(new BankChecking("Checkings2", 334.45, 2));
		checkings.add(new BankChecking("Checkings3", 500.30, 3));
		checkings.add(new BankChecking("Checkings4", 532.32, 4));
		return checkings;
	}
	
	public void addButtonClicked()
	{
		BankChecking checking = new BankChecking();
		try {
		checking.setName(nameInput.getText());
		checking.setBalance(Double.parseDouble(checkingInput.getText()));
		checking.setId(Integer.parseInt(iDInput.getText()));
		}
		catch(Exception e){
			ErrorClass error = new ErrorClass();
		}
		table.getItems().addAll(checking);
		nameInput.clear();
		checkingInput.clear();
		iDInput.clear();
	}
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	


}
