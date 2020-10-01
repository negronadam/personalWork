package inputExamples;
import java.util.Scanner;
public class SpeedTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speedLimit;
		int driverSpeed;
		double ticketCost;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the speed limit");
		speedLimit = input.nextInt();
		System.out.println("Please put in the speed of the driver");
		driverSpeed = input.nextInt();
	}

}
