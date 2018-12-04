package GUITest;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class NewRectangle extends JComponent {
	private char movement;
	private int x;
	private int y;
	public void rectangle(Graphics g)
	//Work on later
	{
		Graphics2D g3 = (Graphics2D) g;
		Rectangle box2 = new Rectangle(10,15,20,25);
		g3.draw(box2);
		while(1==1)
		{
			if(movement == 'w')
			{
				box2.translate();
			}
		}
	}
}
