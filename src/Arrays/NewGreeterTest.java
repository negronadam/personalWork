package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class NewGreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Greeter> greeter = new ArrayList<Greeter>();
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many greeter objects would you like to construct?");
		int numGreeters = input.nextInt();
		while(1 == 1)
		{
			for(int a = 0; a < numGreeters; a++)
				{
					greeter.add(new Greeter(1 + generator.nextInt(50 - 1 + 1)));
				}
		
			for(int i = 0; i < greeter.size(); i++)
				{
					System.out.println("The age in greeter " + greeter.indexOf(greeter.get(i)) + " :" + greeter.get(i).getAge());
				}
		}
	}

}
