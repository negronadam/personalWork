package RandomNumbers;
import java.util.Scanner;
public class YahtzeeTest {

	public static void main(String[] args) {
		Yahtzee yahtzee = new Yahtzee();
		Yahtzee yahtzee2 = new Yahtzee();
		Yahtzee yahtzee3 = new Yahtzee();
		Yahtzee yahtzee4 = new Yahtzee();
		Yahtzee yahtzee5 = new Yahtzee();
		Yahtzee yahtzee6 = new Yahtzee();
		Scanner input = new Scanner(System.in);
		int roll = 0;
		int iIY = 0;
		int piIY = 0;
		while(iIY == 0)
		{
			System.out.println("Type 1 to roll dice");
			roll = input.nextInt();
					if (roll == 1)
					{
						yahtzee.rollDice();
						yahtzee2.rollDice();
						yahtzee3.rollDice();
						yahtzee4.rollDice();
						yahtzee5.rollDice();
						yahtzee6.rollDice();
						System.out.println(yahtzee.rollDice());
						System.out.println(yahtzee2.rollDice());
						System.out.println(yahtzee3.rollDice());
						System.out.println(yahtzee4.rollDice());
						System.out.println(yahtzee5.rollDice());
						System.out.println(yahtzee6.rollDice());
							if (yahtzee.rollDice() == yahtzee2.rollDice())
								{
									if (yahtzee.rollDice() == yahtzee3.rollDice())
										{
											if(yahtzee.rollDice() == yahtzee4.rollDice())
												{
													if(yahtzee.rollDice() == yahtzee5.rollDice())
														{
															if (yahtzee.rollDice() == yahtzee6.rollDice())
																{
																	System.out.println("Cool! You got Yahtzee!");
																	iIY = 1;
																}
														}
												}
										}
								}
					}
		}
	}
}


