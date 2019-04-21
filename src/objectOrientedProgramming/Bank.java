package objectOrientedProgramming;
import javax.swing.*;
import java.awt.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class Bank extends Application implements EventHandler<ActionEvent> {
	Label title;
	Label label;
	Label userLogin;
	Button button2;
	Stage window;
	Scene scene1;
	Scene scene2;
	Button button;

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
		userLogin = new Label("Press the button to make a new checking account!");

		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(title, userLogin);
		scene1 = new Scene(vbox, 1280, 720);
		window.setScene(scene1);
		window.show();
		
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
