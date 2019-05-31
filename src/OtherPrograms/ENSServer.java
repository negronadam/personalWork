package OtherPrograms;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.*;
public class ENSServer extends Application {
	
	//Stages
	Stage window;
	//Scenes
	Scene scene;
	//Labels
	Label title;
	Label test;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("ENS-SERVER VERSION 0.0.1");
		title = new Label("Welcome to the ENS Server Program!");
		test = new Label("Hello! This is a test!");
		VBox vbox = new VBox(20);
		HBox hbox = new HBox(20);
		vbox.getChildren().addAll(title,test);
		hbox.getChildren().addAll(title,test);
		scene = new Scene(hbox, 1280, 720);
		window.setScene(scene);
		window.show();
	}

}
