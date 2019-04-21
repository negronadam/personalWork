package DesigningClasses;

import java.awt.GraphicsEnvironment;
import java.io.Console;
import java.io.IOException;

import net.minecraft.data.Main;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
            Task4Main.main(new String[0]);
            System.out.println("Program has ended, please type 'exit' to close the console");
        }
	}

}
