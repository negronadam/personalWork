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
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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

public class HotelProgramMain extends Application {
	
	Label title;
	Stage window;
	Stage loginSuccess;
	Scene scene1;
	Button login;
	TextField userInput;
	TextField passInput;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
		Scanner input = new Scanner(System.in);
		String user = "TestAdmin";
		String passcode = "TestPass123";
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
			if(testUser.equals(user) && testPass.equals(passcode))
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
		*/
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("Hotel POS Program by Adam Negron");
		title = new Label("Welcome! Please Sign In!");
		GridPane gridPane1 = new GridPane();
		gridPane1.setPadding(new Insets(10,10,10,10));
		gridPane1.setHgap(10);
		gridPane1.setVgap(10);
		gridPane1.setConstraints(title, 0, 0);
		userInput = new TextField();
		userInput.setPromptText("Username");
		gridPane1.setConstraints(userInput, 1, 0);
		passInput = new TextField();
		passInput.setPromptText("Password");
		gridPane1.setConstraints(passInput, 1, 1);
		login = new Button();
		login.setText("Login");
		login.setOnAction(e -> System.out.println("DEBUG: LOG IN BUTTON CLICKED"));
		gridPane1.setConstraints(login, 1, 2);
		
		gridPane1.getChildren().addAll(title, userInput, passInput, login);
		
		scene1 = new Scene(gridPane1, 1280, 720);
		window.setScene(scene1);
		window.show();
	}
	
	public void LoginSuccessful() throws Exception
	{
		
	}

}
