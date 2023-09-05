package DesigningClasses;
import java.util.ArrayList;
public class Ion {
	private ArrayList<Element> ion;
	//Will define multiple constructors for monoatomic, and polyatomic versions.
	public Ion(Element e1)
	{
		ion = new ArrayList<Element>();
		ion.add(e1);
	}
	public Ion(Element e1, Element e2)
	{
		ion = new ArrayList<Element>();
		ion.add(e1);
		ion.add(e1);
	}
	public Ion(Element e1, Element e2, Element e3)
	{
		ion = new ArrayList<Element>();
		ion.add(e1);
		ion.add(e1);
		ion.add(e1);
	}
	public Ion(Element e1, Element e2, Element e3, Element e4)
	{
		ion = new ArrayList<Element>();
		ion.add(e1);
		ion.add(e1);
		ion.add(e1);
		ion.add(e1);
	}
}
