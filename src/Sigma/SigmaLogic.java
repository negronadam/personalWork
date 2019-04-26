package Sigma;

import java.util.ArrayList;

import javafx.collections.ObservableList;

public class SigmaLogic {
	public SigmaLogic()
	{
		
	}
	
	public double findRange(int num1, int num2)
	{
		double range = 0;
		if(num1>num2)
		{
			range = num1 - num2;
		}
		else
		{
			range = num2-num1;
		}
		return range;
	}
	
	public double findMean(ObservableList<SigmaNumber> list)
	{
		double sum = 0;
		double mean = 0;
		for(int a = 0; a < list.size(); a++)
		{
			sum += list.get(a).getNumber();
		}
		mean = sum/list.size();
		return mean;
	}
	
	public double findMedian()
	{
		
	}
	
	public double findMode(ObservableList<SigmaNumber> list)
	{
		double mostOccurNum = 0;
		for(int a = 0; a < list.size(); a++)
		{
			if(number)
		}
		return 10.10;
	}
}
