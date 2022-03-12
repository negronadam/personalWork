package OtherPrograms;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Statistics1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean programIsRunning = true;
		Scanner input = new Scanner(System.in);
		/*TODO Find the sum of a probability and outcome of x
		 * 
		 * 
		 * 
		 * 
		 */
		
		while(programIsRunning)
		{
			
		}
			/*
			double mu = 0;
			ArrayList<Number>arrayList = new ArrayList<Number>();
			System.out.println("Adam Negron's Probability Distribution Calculator v0.5.0a Build 2");
			System.out.println("How many numbers do you need?");
			double space = input.nextDouble();
			for(int i = 0; i < space; i++)
			{
				int index = 0;
				System.out.println("Input X # " + index + " : ");
				Double x = input.nextDouble();
				System.out.println("Input Probability at #" + index + " : ");
				Double prob = input.nextDouble();
				arrayList.add(new Number(x, prob));
				index++;
			}
			
			
			for(int a = 0; a < arrayList.size(); a++)
			{
				System.out.println("Number: " + arrayList.get(a).getNum() + " Probability at this number: " + arrayList.get(a).getProb());
				arrayList.get(a).calcMean();
			}
			//Mu Algorithm..
			for(int m = 0; m < arrayList.size(); m++)
			{
				mu += arrayList.get(m).getMean();
			}
			System.out.println("Mu = " + mu);
			
			for(int x = 0; x < arrayList.size(); x++)
			{
				double diff = arrayList.get(x).getNum() - mu;
				arrayList.get(x).setMuDifference(diff);
			}
			
			for(int i = 0; i < arrayList.size(); i++)
			{
				System.out.println(arrayList.get(i).getMuDiff());
			}
			System.out.println("-------------------------------SQUARING IT-------------------------------");
			for(int i = 0; i < arrayList.size(); i++)
			{
				double calcNum = arrayList.get(i).getMuDiff();
				arrayList.get(i).setSqrMuDiff(calcNum);
				System.out.println(arrayList.get(i).getSqrMuDiff());
			}
			System.out.println("--------------------------FINDING SUM OF PRODUCTS-------------------------------");
			double variance = 0;
			for(int a = 0; a < arrayList.size(); a++)
			{
				arrayList.get(a).findMuDiffSqr();
				variance += arrayList.get(a).getProduct();
				System.out.println(arrayList.get(a).getProduct());
			}
			
			System.out.println("-------------------------------SQUARE ROOTING IT-------------------------------");
			double standardDeviation = Math.sqrt(variance);
			System.out.println("Variance: " + variance);
			System.out.println("Standard Deviation: " + standardDeviation);
			
		}
		*/
	}
	
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	public static double subtract(double a, double b)
	{
		return a - b;
	}
	
	public static double multiply(double a, double b)
	{
		return a * b;
	}
	
	public static double divide(double a, double b)
	{
		return a / b;
	}
	
	
			
	
	

	

}
