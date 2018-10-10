package objectOrientedProgramming;

public class WorkerTest {

	public static void main(String[] args) {
		Worker run = new Worker();
		
		System.out.println("The number of hours worked is: " + run.getHour(5));
		System.out.println("The number of hours worked is: " + run.getRate(25.52));
		System.out.println("The paycheck for this pay window is: $"  + run.getPayCheck());

	}

}
