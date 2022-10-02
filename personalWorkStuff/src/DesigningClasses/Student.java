package DesigningClasses;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Student {
	private List classes;
	public String name;
	private String roomNum;
	private int age;
	private int grade;
	private String rank;
	private boolean hadALready;
	private boolean workingParty;
	private boolean appt;
	private boolean hasClass;
	private boolean isPermanentWP;
	private int roomNumber;
	private ArrayList<String> timesHadWorkingParty;
	private Calendar c;
	private DateFormat dateFormat;
	private String timeOut;
	private String timeIn;
	/*
	public Student(String xName, int xAge, int xGrade)
	{
		name = xName;
		age = xAge;
		grade = xGrade;
	}
	*/
	//Setting permanent working party to false by default because its a small number anyways.
	public Student(String name, int roomNum, int grade, boolean hadAlready, boolean workingParty, boolean appt, boolean hasClass)
	{
		this.name = name;
		this.roomNumber = roomNum;
		this.workingParty = workingParty;
		this.appt = appt;
		this.hasClass = hasClass;
		this.isPermanentWP = false;
		this.timesHadWorkingParty = new ArrayList<String>();
		Calendar c = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
	}
	//Added alternate constructor here because I got bored of changing all the arugments for the other student objects.
	public Student(String name, int roomNum, int grade, boolean hadAlready, boolean workingParty, boolean appt, boolean hasClass, boolean isPermanentWP)
	{
		this.name = name;
		this.roomNumber = roomNum;
		this.workingParty = workingParty;
		this.appt = appt;
		this.hasClass = hasClass;
		this.isPermanentWP = isPermanentWP;
		this.timesHadWorkingParty = new ArrayList<String>();
		Calendar c = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
	}
	
	public Student(String rank, String name, String roomNumber, String timeO)
	{
		Calendar c = Calendar.getInstance();
		this.rank = rank;
		this.name = name;
		this.roomNum = roomNumber;
		this.timeOut = timeO;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		//this.timeStampOut = dateFormat.format(c.getTime());
	}
	public Student()
	{
		
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
	
	public void setTimeLog()
	{ 
		Calendar c = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		this.timeOut = dateFormat.format(c.getTime());
		
		//timesHadWorkingParty.add(strLog);
	}
	public void setTimeIn()
	{
		Calendar c = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		this.timeIn = dateFormat.format(c.getTime());
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
	public boolean hasClass()
	{
		return hasClass;
	}
	public void setClass(boolean choice)
	{
		this.hasClass = choice;
	}
	public boolean checkPermanentWP()
	{
		return isPermanentWP;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	public void setRoomNum(String roomNum)
	{
		this.roomNum = roomNum;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getRoomNum()
	{
		return roomNum;
	}
	
	public String getTimeOut()
	{
		return timeOut;
	}
	public String getTimeIn() {
		return timeIn;
	}
}
