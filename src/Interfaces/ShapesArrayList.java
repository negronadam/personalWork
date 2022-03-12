package Interfaces;
import java.util.ArrayList;
public class ShapesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = 0;
		double smallestPerimeter = 999;
		ArrayList<Shapes> shapes = new ArrayList<Shapes>();
		shapes.add(new Rectangle(2,7));
		shapes.add(new Rectangle(2,8));
		shapes.add(new Circle(4));
		for(int i = 0; i < shapes.size(); i++)
		{
			area += shapes.get(i).area();
		}
		System.out.println("The sum of all areas is: " + area);
		
		for(int a = 0; a < shapes.size(); a++)
		{
			if(shapes.get(a).perimeter() < smallestPerimeter)
			{
				smallestPerimeter = shapes.get(a).perimeter();
			}
		}
		System.out.println("The smallest perimeter is: " + smallestPerimeter);
	}

}
