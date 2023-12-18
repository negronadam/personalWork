import java.util.Scanner;
import java.util.Random;
public class Project2 {
	
	public static String coinFlip(Random gen){
		  gen = new Random(1);
		  int num = gen.nextInt();
	      if(num == 0){
	         return "Tails";
	      }
	      else if(num == 1){
	         return "Heads";
	      }
	      
	      else{
	      return "null";
	      }
	      
	      
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random(1);
		int numFlips = input.nextInt();
	      for(int a = numFlips; a > 0; a--){
	         System.out.println(coinFlip(generator));
	      }
		/*
		Scanner input = new Scanner(System.in);
		int money = -999;
		int total = 0;
		int bettingAmount;
		int iteration = 0;
		boolean isRunning = true;
		Random gen = new Random();
		while(isRunning){
			System.out.println("How much money would you like to bet?");
			if(iteration == 0) {
			money = input.nextInt();
			}
			else if(iteration > 0) {
				money += input.nextInt();
				System.out.println("Total bet: " + money);
			}
			if(money > 0){
				//System.out.println(money);
				String word1 = new String();
				String word2 = new String();
				String word3 = new String();
				for(int a = 0; a < 3; a++) {
					int num = gen.nextInt(6);
					switch(a) {
					case 0:
						switch(num) {
						case 0:
							word1 = "Cherries";
							break;
						case 1:
							word1 = "Oranges";
							break;
							
						case 2:
							word1 = "plums";
							break;
							
						case 3:
							word1 = "Bells";
							break;
							
						case 4:
							word1 = "Melons";
							break;
							
						case 5:
							word1 = "Bars";
							break;
						
						}
						System.out.println(word1);
						break;
						
					case 1:
						switch(num) {
						case 0:
							word2 = "Cherries";
							break;
						case 1:
							word2 = "Oranges";
							break;
							
						case 2:
							word2 = "plums";
							break;
							
						case 3:
							word2 = "Bells";
							break;
							
						case 4:
							word2 = "Melons";
							break;
							
						case 5:
							word2 = "Bars";
							break;
						}
						
						System.out.println(word2);
						break;
						
					case 2:
						switch(num) {
						case 0:
							word3 = "Cherries";
							break;
						case 1:
							word3 = "Oranges";
							break;
							
						case 2:
							word3 = "plums";
							break;
							
						case 3:
							word3 = "Bells";
							break;
							
						case 4:
							word3 = "Melons";
							break;
							
						case 5:
							word3 = "Bars";
							break;
						
						}
						
						System.out.println(word3);
						break;
					}
				}	
				//Break out of the for loop when you have all the words
				if(!word1.equals(word2) && !word1.equals(word3) || !word1.equals(word2) && !word2.equals(word3)) {
					System.out.println("Woo! you win nothing! Better try again!");
				}
				if(word1.equals(word2) && !word1.equals(word3) && !word1.equals(word2) && word1.equals(word3)) {
					System.out.println("Congratulations! you have won the 2x multiplier!");
					total += money * 2;
				}
				if(word1.equals(word2) && word1.equals(word3)) {
					System.out.println("Jackpot! You have won the 3x multiplier!");
					total += money * 3;
					}
				iteration++;
				System.out.println("Would you like to play again? (y/n)");
				char choice = input.next().charAt(0);
				if(choice == 'y') {
					isRunning = true;
				}
				else if(choice == 'n') {
					isRunning = false;
					System.out.println("You bet: " + money);
					System.out.println("You have total earnings of: " + total);
				}
			}
			else if(money < 0){
				System.out.println("Please enter a valid value! (Greater than 0)");
			}
			else if(money == 0) {
				isRunning = false;
			}
		}
		input.close();
		*/
		
	}

}
