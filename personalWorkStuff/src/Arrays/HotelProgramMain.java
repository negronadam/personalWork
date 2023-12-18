package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HotelProgramMain extends Application {
	public static String user;
	public static String passCode;
	Label title;
	Stage window;
	Stage loginSuccess;
	Scene scene1;
	Scene scene2;
	Button login;
	TextField userInput;
	//Changing to password field.
	PasswordField passInput;
	Label title2;
	Button addRooms;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
		Scanner input = new Scanner(System.in);
		user = "TestAdmin";
		passCode = "TestPass123";
		boolean programIsRunning = true;
		HotelRoom room1 = new HotelRoom(99.0, 's', 1, false);
		HotelRoom[][] floorOneRooms = new HotelRoom[10][15];
		ArrayList reservations = new ArrayList();
		while (programIsRunning = true)
		{
			System.out.println("Hello! Welsome to the Hotel Program!");
			System.out.println("Please enter your username");
			String testUser = input.nextLine();
			System.out.println("Please enter your passcode");
			String testPass = input.nextLine();
			if(testUser.equals(user) && testPass.equals(passCode))
			{
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("Welcome Admin... Here is your dashboard:");
				System.out.println("1. View Reservations");
				System.out.println("2. Make a reservation");
				System.out.println("3. Check in a room");
				System.out.println("4. Check for free rooms");
				int choice = input.nextInt();
				switch(choice)
				{
					case 1:
						if(reservations.size() < 0)
						{
							for(int a = 0; a < reservations.size(); a++)
								{
									reservations.get(a);
								}
						}
						else
						{
							System.out.println("There are no reservations...");
						}
						break;
					case 2:
						input.nextLine();
						System.out.println("Please enter the name of the Reservation");
						String resName = input.nextLine();
						System.out.println("Please enter the room number of the Reservation");
						int resRoom = input.nextInt();
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
				}
			}
			else
			{
				System.out.println("Your username or password was incorrect. please try again.");
			}
		}
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("Hotel POS Program by Adam Negron");
		title = new Label("Welcome! Please Sign In!");
		title2 = new Label("Welcome!");
		title2.setFont(new Font(30.0));
		user = "aanegron";
		passCode = "388";
		GridPane gridPane1 = new GridPane();
		GridPane gridPane2 = new GridPane();
		Alert loginAlert = new Alert(AlertType.NONE);
		gridPane1.setPadding(new Insets(10,10,10,10));
		gridPane1.setHgap(10);
		gridPane1.setVgap(10);
		gridPane1.setConstraints(title, 0, 0);
		userInput = new TextField();
		userInput.setPromptText("Username");
		gridPane1.setConstraints(userInput, 1, 0);
		passInput = new PasswordField();
		passInput.setPromptText("Password");
		gridPane1.setConstraints(passInput, 1, 1);
		login = new Button();
		/*Login Screen interactive events.
		 * 
		 */
		login.setText("Login");
		//addRooms.setText("Add Rooms");
		//addRooms.setShape(new Rectangle());
		//addRooms.setMaxSize(3, 3);
		login.setOnAction(e -> {
			if(userInput.getText().equals(user) && passInput.getText().equals(passCode)) {
				System.out.println("Login Successful!");
				loginAlert.setAlertType(AlertType.CONFIRMATION);
				loginAlert.setContentText("You are entering proprietry software, Continue?");
				loginAlert.show();
				window.setScene(scene2);
			}
			else {
				System.out.println("Username or Password incorrect!");
				loginAlert.setAlertType(AlertType.ERROR);
				loginAlert.setContentText("The Username or Password is incorrect!");
				loginAlert.show();
			}
			
		});
		addRooms = new Button();
		addRooms.setText("Add Rooms!");
		gridPane1.setConstraints(login, 1, 2);
		//V.1.2.0
		gridPane1.setAlignment(Pos.CENTER);
		
		gridPane1.getChildren().addAll(title, userInput, passInput, login);
		gridPane2.add(title2, 0, 0);
		gridPane2.add(addRooms, 0,5);
		gridPane2.setAlignment(Pos.CENTER);
		//gridPane2.getChildren().addAll(title2);
		scene1 = new Scene(gridPane1, 1280, 720);
		scene1.setFill(Color.BLACK);
		scene2 = new Scene(gridPane2, 1280, 720);
		window.setScene(scene1);
		window.show();
	}
	public void LoginSuccessful() throws Exception
	{
		
	}

}

