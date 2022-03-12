package DesigningClasses;
import java.util.List;
public class Student {
	private List classes;
	private String name;
	private int age;
	private int grade;
	public Student(String xName, int xAge, int xGrade)
	{
		name = xName;
		age = xAge;
		grade = xGrade;
	}
	public String getName()
	{
		return name;
	}
}
