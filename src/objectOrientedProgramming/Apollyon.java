package objectOrientedProgramming;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Apollyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello();
		System.out.println("The current date and time is: " + getTime());
	}
	
	public static void sayHello()
	{
		System.out.println("Hello! I am Apollyon0");
	}
	
	public static void runCodeBreaker()
	{
		
	}


	public static void accessWebsite(String website)
	{
		
	}
	
	public static String getTime()
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		return df.format(dateobj);
	}

}
