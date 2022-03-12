package OtherPrograms;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class zScoreFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is the zScoreFinder main
		ArrayList<zScore>zScores = new ArrayList<zScore>();
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		zScores.add(new zScore(-3.49, .0002));
		zScores.add(new zScore(-3.48, .0003));
		zScores.add(new zScore(-3.47, .0003));
		zScores.add(new zScore(-3.46, .0003));
		zScores.add(new zScore(-3.45, .0003));
		zScores.add(new zScore(-3.44, .0003));
		zScores.add(new zScore(-3.43, .0003));
		zScores.add(new zScore(-3.42, .0003));
		zScores.add(new zScore(-3.41, .0003));
		zScores.add(new zScore(-3.40, .0003));
		zScores.add(new zScore(-3.39, .0003));
		zScores.add(new zScore(-3.38, .0004));
		zScores.add(new zScore(-3.37, .0004));
		zScores.add(new zScore(-3.36, .0004));
		zScores.add(new zScore(-3.35, .0004));
		zScores.add(new zScore(-3.34, .0004));
		zScores.add(new zScore(-3.33, .0004));
		zScores.add(new zScore(-3.32, .0005));
		zScores.add(new zScore(-3.31, .0005));
		zScores.add(new zScore(-3.30, .0005));
		zScores.add(new zScore(-3.29, .0005));
		zScores.add(new zScore(-3.28, .0005));
		zScores.add(new zScore(-3.27, .0005));
		zScores.add(new zScore(-3.26, .0006));
		zScores.add(new zScore(-3.26, .0006));
		zScores.add(new zScore(-3.25, .0006));
		zScores.add(new zScore(-3.24, .0006));
		zScores.add(new zScore(-3.23, .0006));
		zScores.add(new zScore(-3.22, .0006));
		zScores.add(new zScore(-3.21, .0007));
		zScores.add(new zScore(-3.20, .0007));
		zScores.add(new zScore(-3.19, .0007));
		zScores.add(new zScore(-3.18, .0007));
		zScores.add(new zScore(-3.17, .0008));
		zScores.add(new zScore(-3.16, .0008));
		zScores.add(new zScore(-3.15, .0008));
		zScores.add(new zScore(-3.14, .0008));
		zScores.add(new zScore(-3.13, .0009));
		zScores.add(new zScore(-3.12, .0009));
		zScores.add(new zScore(-3.11, .0010));
		zScores.add(new zScore(-3.10, .0010));
		boolean programIsRunning = true;
		System.out.println("Welcome to Adam Negron's zScore finder!");
		while(programIsRunning)
		{
			double num = input.nextDouble();
			double num1 = 0;
			double num2 = 0;
			
			for(int a = 0; a < zScores.size(); a++)
			{
				if(zScores.get(a).getX() == num)
				{
					System.out.println("The zScore for this value is: " + df.format(zScores.get(a).getZScore()));
				}
				else
				{
					System.out.println("Invalid value! Please try again...");
				}
			}
		}
	}

}
