package DesigningClasses;
import java.util.ArrayList;
public class FileSystem {
	private ArrayList<File> files;
	private String name;
	private int size;
	private int spaceLeft;
	 public FileSystem(String xName, int xSize)
	 {
		 files = new ArrayList<File>();
		 xName = name;
		 xSize = size;
		 xSize = spaceLeft;
	 }
	 
	 public void addFile(String name, int size)
	 {
		files.add(new File(name, size)); 
	 }
	 
	 public void removeFile(String xName)
	 //TODO Figure this out later.
	 {
		 for(int a = 0; a < files.size(); a++)
		 {
			 if(files.get(a).getName().equals(xName))
			 {
				 files.remove(a);
				 System.out.println("The file : " + xName + " has been removed!");
			 }
		 }
	 }
	 
	 public boolean fileExists(String xFile)
	 {
		 for(int i = 0; i < files.size(); i++)
		 {
			if(files.get(i).getName().equals(xFile))
			{
				return true;
			}
		 }
		 return false;
	 }
	 
}
