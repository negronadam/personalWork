package Arrays;
import java.util.ArrayList;
public class MoreRectangleArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
		for(int i = 0; i < 51; i++)
		{
			rectangle.add(new Rectangle(51,22));
		}
		System.out.println(rectangle.get(45).area());
	}

}
