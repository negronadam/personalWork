package DesigningClasses;

public class Monarch {
	private String name;
	private int rulingPower;
	private int army;
	public Monarch(String xName, int xRuling, int xArmy)
	{
		xName = name;
		xRuling = rulingPower;
		xArmy = army;
	}
	
	public int getRulingPower()
	{
		return rulingPower;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getArmy()
	{
		return army;
	}
}
