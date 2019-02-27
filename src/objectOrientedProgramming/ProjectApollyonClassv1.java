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
	String[] string = new String[100];
	Scanner input = new Scanner(System.in);
	public ProjectApollyonClassv1()
	{
		
	}
	
	public void sayHello()
	{
		System.out.println("Hello!, My name is Apollyon!");
	}
	
	public int getStringsRemembered()
	{
		return string.length;
	}
	
	public void addMemory()
	{
		
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
		if(choice == "yes" || choice == "Yes" || choice == "Yeah")
		{
			
		}
		else
		{
			System.out.println("I understand");
		}
	}
	
	public void signInWebsite(String xUrl, String xUsername, String xPassword) throws MalformedURLException
	{
		String url = xUrl;
		String username = xUsername;
		String password = xPassword;
		
		URL connection = new URL(url);
	}
}
