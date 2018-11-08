package GUITest;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class DrawRectangle extends JComponent {
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(5,10,20,30);
		g2.draw(box);
		box.translate(15,25);
		g2.draw(box);
		g2.setColor(Color.MAGENTA);
		g2.drawString("Hello! I am Adam's Program!", 50, 100);
	}
	
}
