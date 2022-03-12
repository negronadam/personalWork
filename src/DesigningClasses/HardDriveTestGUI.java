package DesigningClasses;
import javax.swing.*;
import javax.swing.JFrame;
public class HardDriveTestGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Test GUI
		JFrame frame = new JFrame();
		frame.setTitle("Adam's Virtual Hard Drive Tool");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TextClass component = new TextClass();
		frame.add(component);
		frame.setVisible(true);
	}

}
