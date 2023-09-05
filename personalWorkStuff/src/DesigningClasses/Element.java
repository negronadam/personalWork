package DesigningClasses;

public class Element {
	//TODO DO NOT DELETE
	private String name;
	private String abbrev;
	private String group;
	private double atomicMass;
	private int atomicNumber;
	private int standAloneCharge;
	public Element(String name, String abbrev, String group, double atomicMass, int atomicNumber, int standAloneCharge) {
		name = this.name;
		abbrev = this.abbrev;
		group = this.group;
		atomicMass = this.atomicMass;
		atomicNumber = this.atomicNumber;
		standAloneCharge = this.standAloneCharge;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAbbrev()
	{
		return this.abbrev;
	}
	
	public String getGroup()
	{
		return this.group;
	}
	
	public double getAtomicMass()
	{
		return this.atomicMass;
	}
	
	public double getAtomicNumber()
	{
		return this.atomicNumber;
		
	}
	
	public int getStandAloneCharge()
	{
		return this.standAloneCharge;
	}
	
	public void setName(String name)
	{
		this.name.equals(name);
	}
	public void setAbbrev(String Abbrev)
	{
		this.abbrev.equals(Abbrev);
	}
	public void setGroup(String group)
	{
		this.group.equals(group);
	}
	public void setAtomicMass(double AtomicMass)
	{
		this.atomicMass = AtomicMass;
	}
	public void setAtomicNumber(int  AtomicNumber)
	{
		this.atomicNumber = AtomicNumber;
	}
	
	
}
