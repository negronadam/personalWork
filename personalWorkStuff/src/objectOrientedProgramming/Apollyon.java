package objectOrientedProgramming;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.StyledDocument;

public class Apollyon {
	private static ArrayList<String> wordDatabase;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Apollyon();
	}
	
	public JFrame frame;
	public JTextPane console;
	public JTextField input;
	public JScrollPane scrollpane;
	
	public StyledDocument document;
	
	boolean trace = false;
	
	public Apollyon()
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) {}
		
		frame = new JFrame();
		frame.setTitle("Apollyon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		console = new JTextPane();
		
		
		
		
		input = new JTextField();
		
		scrollpane = new JScrollPane(console);
		frame.add(input, BorderLayout.SOUTH);
		frame.add(scrollpane, BorderLayout.CENTER);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
