package GUITest;
import java.awt.Frame;
import java.awt.Window;
import java.awt.Component;
import java.awt.Event;
import javax.swing.*;
public class GUITest1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Adam's First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(1280,720);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button);
	       frame.setVisible(true);
		
	}

}
