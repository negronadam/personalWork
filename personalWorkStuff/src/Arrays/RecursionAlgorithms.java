package Arrays;

public class RecursionAlgorithms {
	public void printHello(int howMany)
	{
		if(howMany > 0)
		{
			System.out.println("Hello!");
			printHello(howMany - 1);
		}
		
		else
		{
			System.out.println("Done");
		}
	}
}
