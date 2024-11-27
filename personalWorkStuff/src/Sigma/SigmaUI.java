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
	public static double NACL_MASS;
	public static double CL_MASS;
	/*
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
	*/
	
	
	public static void main(String args[]) {
		NACL_MASS = 58.45;
		CL_MASS = 35.45;
		double[] unknownValues  = new double[4];
		unknownValues[0] = 0.2502;
		unknownValues[1] = 0.2505;
		unknownValues[2] = 0.2500;
		unknownValues[3] = 0.2502;
		double[] volumes = {0.0248, 0.0253, 0.0288, 0.0329};
		for(int a = 0; a < 4; a++) {
			System.out.println(calcIons(unknownValues[a], volumes[a]));
		}
		System.out.println("Done!");
	}
	
	
	public static double calcIons(double unknown, double vol1) {
		double convToMolAgNO3 = (0.5057 * vol1);
		// Reaction is 1:1 so we can use the same value here.
		double convToGramsCL = convToMolAgNO3 * CL_MASS;
		return convToGramsCL;
	}
	
}
