package Sigma;
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

public class Sigma extends Application implements EventHandler<ActionEvent> {

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

		
		BorderPane border = new BorderPane();
		HBox hbox = new HBox();
		VBox vbox = new VBox(20);
		VBox vbox2 = new VBox(20);
		StackPane stack = new StackPane();
		vbox.getChildren().add(userLogin);
		vbox2.getChildren().add(title);
		border.setTop(vbox2);
		border.setCenter(vbox);
		border.getChildren().addAll(title, userLogin);
		scene1 = new Scene(border, 1280, 720);
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
