package OtherPrograms;

public class Number {
	private double num;
	private double freq;
	private double mean;
	private double probability;
	private double muDiff;
	private double sqrMuDiff;
	private double ProbXSqrMuDiff;
	private double variance;
	private double standardDeviation;
	private double sumProbXSqrMuDiff;
	private double product;
	public Number(double xNum, double xProb)
	{
		num = xNum;
		probability = xProb;
	}

	
	public void setNum(double xNum)
	{
		num = xNum;
	}
	
	public double getNum()
	{
		return num;
	}
	
	public void setProb(double xProb)
	{
		probability = xProb;
	}
	
	public double getProb()
	{
		return probability;
	}
	
	public void calcMean()
	{
		mean = num * probability;
	}
	
	public double getMean()
	{
		return mean;
	}
	
	public void setMuDifference(double diff)
	{
		muDiff = diff;
	}
	
	public double getMuDiff()
	{
		return muDiff;
	}
	
	public void setSqrMuDiff(double muDiff1)
	{
		sqrMuDiff =  muDiff1 * muDiff1;
	}
	
	public double getSqrMuDiff()
	{
		return sqrMuDiff;
	}
	
	public void setSumProbXSqrMuDiff(double sqrMuDiff1)
	{
		product = probability * sqrMuDiff1;
	}
	
	public void findMuDiffSqr()
	{
		product = probability * sqrMuDiff;
	}
	
	public double getProduct()
	{
		return product;
	}
}

