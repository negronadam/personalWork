package DesigningClasses;
import javax.swing.*;
import java.awt.FlowLayout;
import javafx.application.Application;
import javafx.stage.Stage;
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
public class testMain extends Application{
	
	Stage window;
	Label title;
	Scene titleScreen;
	Button startQuiz;
	Question test;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		/*
		test launch = new test();
		launch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launch.setSize(275, 180);
		launch.setVisible(true);
		*/
		/*
		Bot bot = new Bot("e45662a5d9388fff7574998ff3");
		bot.sendTextMessage("This is a test message");
		System.out.println("Message Sent");
		*/
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		primaryStage.setTitle("Test Software v0.0.0.1a");
		title = new Label("Welcome to my Testing Software!");
		startQuiz = new Button("Start Quiz");
		startQuiz.setOnAction(e -> {new Question(); test.display();});
		VBox vBox1 = new VBox(20);
		vBox1.getChildren().addAll(title, startQuiz);
		titleScreen = new Scene(vBox1, 1280, 720);
		window.setScene(titleScreen);
		window.show();
	}
	
		
}
