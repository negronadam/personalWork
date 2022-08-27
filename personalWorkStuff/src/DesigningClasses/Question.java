package DesigningClasses;
import java.util.Calendar;

import javafx.*;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
public class Question {
	private static String question;
	private static int questionNumber;
	private static double pointsPoss;
	private static String answer1;
	private static String answer2;
	private static String answer3;
	private static String answer4;
	private static String correctAnswer;
	private static boolean checkCorrect;
	private static Stage window;
	private static Calendar cal;
	private static Label questionListNumber;
	private static Label questionText;
	private static Scene scene1;
	private static TableView<Student> table;
	private static ObservableList<Student> list;
	private static ObservableList<Student> roster;
	private static TextField inputRank;
	private static TextField inputName;
	private static TextField inputRoom;
	//private static TextField inputTime;
	private static Button add;
	private static Button checkIn;
	private static Button submit;
	private static Button answer1Button;
	private static Button answer2Button;
	private static Button answer3Button;
	private static Button answer4Button;
	private static ArrayList answers;
	/*
	 * This class will open a window that has a question.
	 * Answering the question will return a boolean of true or
	 * false. The question objects will be stored in an arraylist
	 * depending on the test. Until I decide to make it work
	 * otherwise.
	 * TODO Remember to create multiple constructors for different question types
	 * i.e. multiple choice questions and true/false questions.
	 * I might have to create an "answer class" in order to perform the
	 * checks I need for each answer.
	 * 
	 */
	public Question()
	{
		//default constructor.
	}
	public Question(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, int questionNumber, double pointPoss)
	{
		//Alternate constructor for multiple choice questions
		this.question = question;
		this.questionNumber = questionNumber;
		this.pointsPoss = pointsPoss;
		this.answer1 = answer1;
		
	}
	
	public static void display()
	{
		window = new Stage();
		//Update this code to get the actual question number
		window.setTitle("Question");
		window.setMinWidth(250);
		questionListNumber = new Label(String.valueOf(questionNumber));
		questionText = new Label(question);
		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(questionText);
		scene1 = new Scene(vBox, 1280, 720);
		window.setScene(scene1);
		window.show();
	}
	
	public boolean isCorrect()
	{
		return true;
	}
}
