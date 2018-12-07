package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class MoreArrayListActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Rectangle> arrayList = new ArrayList<Rectangle>();
		Random generator = new Random(255);
		for(int i = 0; i < 5; i++)
		{
			arrayList.add(new Rectangle(50 + generator.nextInt(70 - 50 + 1), 50 + generator.nextInt(70 - 50 + 1)));
		}
		
		for(int a = arrayList.size() - 1; a >= 0; a--)
		{
			System.out.print(arrayList.get(a).area() + "\t");
		}
		System.out.println();
	}

}
