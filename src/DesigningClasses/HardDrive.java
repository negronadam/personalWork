package DesigningClasses;
import java.util.ArrayList;
public class HardDrive {
	private String name;
	private double totalCapacity;
	private double freeSpace;
	private ArrayList<Double> files;
	
	public HardDrive(String xName, Double xCapacity)
	{
		name = xName;
		totalCapacity = xCapacity;
		freeSpace = xCapacity;
		files = new ArrayList<Double>();
		
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
	
	public void isFull()
	{
		if(freeSpace == 0)
		{
			System.out.println("The hard drive is full!");
		}
		
		else
		{
			System.out.println("The hard drive is not full!");
		}
	}
	
	public void isEmpty()
	{
		if(freeSpace > 0)
		{
			System.out.println("The hard drive is not full!");
		}
		
		else
		{
			System.out.println("The hard drive is full!");
		}
	}
	
	public void checkHardDrive()
	{
		for(int a = 0; a < files.size(); a++)
		{
			System.out.println(files.get(a));
		}
	}
	
}
