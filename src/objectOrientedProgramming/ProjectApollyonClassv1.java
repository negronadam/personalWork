package objectOrientedProgramming;
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
public class ProjectApollyonClassv1 {
	private ArrayList<ApollyonMemory> memory;
	Scanner input = new Scanner(System.in);
	private String statement;
	public ProjectApollyonClassv1()
	{
		memory = new ArrayList<ApollyonMemory>();
		memory.add(new ApollyonMemory("What is this?", "I don't know..."));
		memory.add(new ApollyonMemory("What is this place?", "Maybe they can answer me..."));
		memory.add(new ApollyonMemory("Who are you?", ""));
		memory.add(new ApollyonMemory("Who am I?", "I am Apollyon. Brother of 8"));
	}
	
	public int running(int baseCase)
	{
		while(baseCase == 1)
		{
			
		}
		return 1;
	}
	
	public void sayHello()
	{
		System.out.println("Hello!, My name is Apollyon!");
	}
	
	public int getStringsRemembered()
	{
		return memory.size();
	}
	
	public void addMemory()
	{
		memory.add(new ApollyonMemory("", ""));
	}
	
	public int calcAdd(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public int calcSubtract(int num1, int num2)
	{
		return num1 - num2;
	}
	
	public void askQuestion()
	{
		System.out.println("Can I ask a question?");
		String choice = input.nextLine();
		if(choice.equals("yes") || choice.equals("Yes") || choice.equals("Yeah"))
		{
			
		}
		else
		{
			System.out.println("I understand");
		}
	}
	
	public String getGreeting()
	{
		return "Hello! Let's chat...";
	}
	
	public String getResponse(String statement)
	{
		if(statement.equals(memory.get(1).getQuestion()));
		{
			return "I am Apollyon, a global peace keeping initiative created by Adam Negron";
		}
		 
	}
	public void signInWebsite(String xUrl, String xUsername, String xPassword) throws MalformedURLException
	{
		String url = xUrl;
		String username = xUsername;
		String password = xPassword;
		
		URL connection = new URL(url);
	}
	
	public void memoryExists(ArrayList<ApollyonMemory> array)
	{
		
	}
	
	public void await()
	{
		
	}
	
	public void tictactoe()
	{
		int[] board = new int[9];
		System.out.println("Let's play a game...");
		System.out.println("I know! Tic Tac Toe!");
		System.out.println("Do you know how to play?");
		String answer = input.nextLine();
		if(answer.equals("yes")||answer.equals("Yeah")||answer.equals("ye")||answer.equals("Yes"))
		{
			System.out.println("Alright let's get to work then.");
		}
		else
		{
			System.out.println("The gameboard looks like this:");
			System.out.println("/---|---|---\\");
			System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
			System.out.println("|-----------|");
			System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
			System.out.println("|-----------|");
			System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
			System.out.println("/---|---|---\\");
		}
	}
}
