package Sigma;
import javax.swing.*;
import java.time.Clock;
import java.time.Instant;
import java.awt.*;
public class SigmaUI extends JFrame {
	
	private JLabel itemHeader;
	private JLabel time;
	private JLabel desc;
	private JTextField textbox;
	private JMenuBar menu;
	
	public SigmaUI()
	{
		super("Sigma");
		Panel panel = new Panel();
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		//Defining JLabel Objects
		itemHeader = new JLabel("Welcome to Sigma v0.1 developed by Adam Negron!");
		desc = new JLabel("This is a program designed by Adam Negron as a project in Statistics");
		desc.setLocation(50,50);
		//Defining JTextFields
		//Adding JLabel Objects
		add(itemHeader);
		add(desc);
		//Adding JTextFields
		//Defining menubar items
		menu = new JMenuBar();
	}
	
}
