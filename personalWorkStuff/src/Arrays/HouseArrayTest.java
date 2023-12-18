package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;  
public class HouseArrayTest {

	//public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		ArrayList<House> house = new ArrayList<House>();
		for(int a = 0; a < 2; a++)
		{
			System.out.println("Who owns the house? Use the last name");
			String xName = input.nextLine();
			System.out.println("How many residents are in the house?");
			int xRes = input.nextInt();
			System.out.println("How many pets are in the house?");
			int xPet = input.nextInt();
			System.out.println("How many floors are in the house?");
			int xFloor = input.nextInt();
			System.out.println("How much money is the house valued at?");
			int xValue = input.nextInt();
			house.add(new House(xName, xRes, xPet, xFloor, xValue));
		}
		
		for(int a = 0; a < house.size(); a++)
		{
			System.out.println(house.get(a).toString());
		}
		
		input.close();
		*/
		/*
		while(1==1)
		{
			System.o
		}
		*/
		
	//}
	
	public static String getPhoneNumber(String[] nameArr, String[] phoneNumberArr, String contactName, int arraySize){
	      for(int a = 0; a < arraySize; a++){
	         if(nameArr[a].equals(contactName)){
	            return nameArr[a];
	         }
	         else{
	           return "None"; 
	         }
	      }
	      return "Test";
	      
	   }
	   
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Input number");
	      int sizeArr = input.nextInt();
	      String[] nameArray = new String[sizeArr];
	      nameArray[0] = "John,117";
	      String[] phoneArray = new String[sizeArr];
	      for(int a = 0; a < nameArray.length - 1; a++) {
	    	  for(int b = 0; b < nameArray[a].length(); a++) {
	    		  if(nameArray[a].charAt(b) == ',') {
	    			  phoneArray[a] = nameArray[a].substring(b);
	    		  }
	    	  }
	      }
	      System.out.println(phoneArray[0]);
	      System.out.println("Input name to find...");
	      String contact = input.next();
	      //System.out.println(getPhoneNumber(nameArray, phoneArray, contact, sizeArr));
	      
	   }

}
