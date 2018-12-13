package Arrays;

public class Greeter {
	private int age;
	
	public Greeter()
	{
		age = -999;
	}
	
	public Greeter(int xAge)
	{
		age = xAge;
	}
	
	public void sayHello()
	{
		System.out.println("Hello!");
	}
	
	public int getAge()
	{
		return age;
	}
}
