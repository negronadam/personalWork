package Arrays;

public class House {
	private String familyName;
	private int numResident;
	private int numPets;
	private int numFloors;
	private int numValue;
	
	public House(String xName, int xRes, int xPets, int xFloors, int xValue)
	{
		xName = familyName;
		xRes = numResident;
		xPets = numPets;
		xFloors = numFloors;
		xValue = numValue;
	}
	
	public void removeResident(int remove)
	{
		numResident = numResident - remove;
	}
	
	public void addResident(int add)
	{
		numResident = numResident + add;
	}
	
	public int getResident()
	{
		return numResident;
	}
	
	public int getValue()
	{
		return numValue;
	}
	
	public String toString()
	{
		return "This is a house owned by the " + familyName + " family with a resident number of " + numResident + " people and " + numPets + "pets, the house has" + numFloors + " floors and is valued at $" + numValue;
	}
	
}
