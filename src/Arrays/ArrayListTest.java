package Arrays;
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayListCheck> phone = new ArrayList<ArrayListCheck>();
		phone.add(new ArrayListCheck("Adam", "2626410451"));
		System.out.println(phone.get(0).getName());
		
	}

}
