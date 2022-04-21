package DesigningClasses;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Student {
	private List classes;
	private String name;
	private int age;
	private int grade;
	private boolean hadALready;
	private boolean workingParty;
	private boolean appt;
	private int roomNumber;
	private ArrayList<String> timesHadWorkingParty;
	private Calendar c;
	private DateFormat dateFormat;
	
	/*
	public Student(String xName, int xAge, int xGrade)
	{
		name = xName;
		age = xAge;
		grade = xGrade;
	}
	*/
	public Student(String name, int roomNum, int grade, boolean hadAlready, boolean workingParty, boolean appt)
	{
		this.name = name;
		this.roomNumber = roomNum;
		this.workingParty = workingParty;
		this.appt = appt;
		this.timesHadWorkingParty = new ArrayList<String>();
		Calendar c = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
	}
	
	public ArrayList<String> getTimesHadWorkingParty()
	{
		ArrayList<String> times = new ArrayList<String>();
		for(int a = 0; a < timesHadWorkingParty.size(); a++)
		{
			times.add(timesHadWorkingParty.get(a));
		}
		return times;
		
		
	}
	
	public void addTimeLog()
	{
		String strLog = dateFormat.format(c.getTime());
		timesHadWorkingParty.add(strLog);
	}
	public String getName()
	{
		return name;
	}
	
	public boolean hadWorkingParty()
	{
		return workingParty;
	}
	
	public boolean hasAppointment()
	{
		return appt;
	}
	
	public void setWorkingParty(boolean value)
	{
		workingParty = value;
	}
	
	public void setApptStatus(boolean value)
	{
		appt = value;
	}
}
