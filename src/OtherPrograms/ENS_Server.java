package OtherPrograms;
import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class ENS_Server extends Application {
	//Stages
	Stage window;
	
	//Scenes
	Scene scene1;
	//Labels
	Label header1;
	//Buttons
	Button sendButton;
	//Textfields
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("ENS-Server VERSION 0.0.1");
		header1 = new Label("Welcome to the ENS-Server Application!");
		sendButton = new Button("Send Emergency Message");
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(header1, sendButton);
		scene1 = new Scene(vbox, 1280, 720);
		window.setScene(scene1);
		window.show();
	}

}
