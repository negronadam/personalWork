package DesigningClasses;
import java.util.ArrayList;
public class HardDrive {
	private String Name;
	private double totalCapacity;
	private double freeSpace;
	ArrayList<Double> files = new ArrayList<Double>();
	public HardDrive()
	{
		
	}
	
	public void addFile(double xSize)
	{
		if(xSize < freeSpace)
		{
			freeSpace -= xSize;
			files.add(xSize);
		}
		
		else
		{
			System.out.println("There is not enough room on the Hard Drive!");
		}
	}
	
	public void deleteFile(int xIndex)
	{
		Double fileToDelete = files.get(xIndex);
		freeSpace += fileToDelete;
		files.remove(xIndex);
	}
	
	
	
	
}
