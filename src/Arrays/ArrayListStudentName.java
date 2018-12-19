package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListStudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> studentArray = new ArrayList<String>();
		System.out.println("Please enter the amount of student names to enter");
		int studentNames = input.nextInt();
		input.nextLine();
		for(int i = 0; i < studentNames; i++)
		{
			System.out.println("What is the student name?");
			studentArray.add(i, input.nextLine());
		}
		studentArray.remove(0);
		studentArray.remove(studentArray.size() - 1);
		for(int a = 0; a < studentArray.size(); a++)
		{
			System.out.println(studentArray.get(a));
		}
	}

}
