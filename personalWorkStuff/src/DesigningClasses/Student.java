package DesigningClasses;
import java.util.List;
public class Student {
	private List classes;
	private String name;
	private int age;
	private int grade;
	private boolean hadALready;
	private int roomNumber;
	
	/*
	public Student(String xName, int xAge, int xGrade)
	{
		name = xName;
		age = xAge;
		grade = xGrade;
	}
	*/
	public Student(String xName, int roomNum, int xGrade, boolean xHadAlready)
	{
		name = xName;
		roomNumber = roomNum;
	}
	public String getName()
	{
		return name;
	}
}
