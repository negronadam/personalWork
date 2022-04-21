package DesigningClasses;
import javax.swing.*;
import java.awt.FlowLayout;
public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		test launch = new test();
		launch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launch.setSize(275, 180);
		launch.setVisible(true);
		*/
		Bot bot = new Bot("e45662a5d9388fff7574998ff3");
		bot.sendTextMessage("This is a test message");
		System.out.println("Message Sent");
	}

}
