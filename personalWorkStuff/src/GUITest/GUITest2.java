package GUITest;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class GUITest2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("My Second GUI!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawRectangle component = new DrawRectangle();
		frame.add(component);
		frame.setVisible(true);
		

	}

}
