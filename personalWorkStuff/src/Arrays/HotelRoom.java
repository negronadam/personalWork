package Arrays;

public class HotelRoom {
	/*The character legend for type is as included:
	 * s = single
	 * d = double
	 *
	 */
	private double cost;
	private char type;
	private int number;
	private boolean isReserved;
	public HotelRoom(double cost, char type, int number, boolean isReserved)
	{
		this.cost = cost;
		this.type = type;
		this.number = number;
		this.isReserved = isReserved;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public char getType()
	{
		return type;
	}
	
	public int getRoomNum()
	{
		return number;
	}
	
	public boolean getReservedStatus()
	{
		return isReserved;
	}
	
	public void setRoomTaken()
	{
		isReserved = true;
	}
	
	public void setRoomVacant()
	{
		isReserved = false;
	}
	
	public void changePrice(int newCost)
	{
		cost = newCost;
	}
	
	public void changeType(char newType)
	{
		type = newType;
	}
}
