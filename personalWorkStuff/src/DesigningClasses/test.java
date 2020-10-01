package DesigningClasses;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class test extends JFrame {
	private JLabel item1;
	
	public test()
	{
		super("Adam's Statistics Program");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is Adam Negron's Statistics Solver!");
		item1.setToolTipText("Hey! You found me!");
		add(item1);
	}


}
