import java.util.Scanner;
public class ProgrammingProject3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char[] examCorrectAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
		char[] studentAnswers = new char[20];
		System.out.println("~~~DRIVERS LISCENSE EXAM~~~");
		System.out.println("Please provide an answer to the question");
		//Because the exam will have 20 questions and 20 answers always, It's fine to assume that the for loops only need to iterate 20 times.
		for(int a = 0; a < 20; a++) {
			System.out.println("Question: " + (a + 1));
			char answer = input.nextLine().charAt(0);
			/* This does not force the user to input a valid input for this question however It will play a factor in counting up how many
			Were actually missed, I am assuming that is what you are looking for since it is otherwise not possible to "Miss" a question
			other than just using an invalid input.
			*/
			if(answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D') {
				studentAnswers[a] = answer;
			}
			else {
				System.out.println("Not a valid input!");
			}
		}
		for(int a = 0; a < studentAnswers.length; a++) {
			System.out.println(studentAnswers[a]);
		}
		if(passed(studentAnswers, examCorrectAnswers) == true) {
			System.out.println("Congratulations, you passed!");
			System.out.println("Correct Answers: " + totalCorrect(studentAnswers, examCorrectAnswers));
			System.out.println("Incorrect Answers: " + totalIncorrect(studentAnswers, examCorrectAnswers));
			System.out.println("Questions missed: ");
			for(int a = 0; a < questionsMissed(studentAnswers).length; a++) {
				System.out.println(questionsMissed(studentAnswers)[a]);
			}
		}
		if(passed(studentAnswers, examCorrectAnswers) == false) {
			System.out.println("Unfortunately you have failed! Try again!");
			System.out.println("Correct Answers: " + totalCorrect(studentAnswers, examCorrectAnswers));
			System.out.println("Incorrect Answers: " + totalIncorrect(studentAnswers, examCorrectAnswers));
			System.out.println("Questions missed: ");
			for(int a = 0; a < questionsMissed(studentAnswers).length; a++) {
				if(questionsMissed(studentAnswers)[a] != 0) {
				System.out.println(questionsMissed(studentAnswers)[a]);
				}
			}
		}
	}
	
	public static boolean passed(char[] answers, char[] correctAnswers) {
		int totalCorrect = 0;
		boolean passed;
		for(int a = 0; a < 20; a++) {
			if(answers[a] == correctAnswers[a]) {
				totalCorrect++;
			}
		}
		if(totalCorrect >= 15) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int totalCorrect(char[] answers, char[] correctAnswers) {
		int totalCorrect = 0;
		for(int a = 0; a < 20; a++) {
			if(answers[a] == correctAnswers[a]) {
				totalCorrect++;
			}
		}
		return totalCorrect;
	}
	public static int totalIncorrect(char[] answers, char[] correctAnswers) {
		int totalIncorrect = 0;
		for(int a = 0; a < 20; a++) {
			if(answers[a] != correctAnswers[a]) {
				totalIncorrect++;
			}
		}
		return totalIncorrect;
	}
	public static int[] questionsMissed(char[] answers) {
		int[] questions = new int[20];
		for(int a = 0; a < 20; a++) {
			if(answers[a] != 'A' && answers[a] != 'B' && answers[a] != 'C' && answers[a] != 'D') {
				questions[a] = a + 1;
			}
		}
		return questions;
	}

}
