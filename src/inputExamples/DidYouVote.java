package inputExamples;

import java.util.Scanner;

public class DidYouVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Boolean vote;
		System.out.println("Did you vote? True/False");
		vote = input.nextBoolean();
		System.out.println("You chose:" + vote);
	}

}
