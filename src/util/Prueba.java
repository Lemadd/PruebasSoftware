package util;

import java.io.File;
import java.util.logging.FileHandler;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"\\Logging.html");
	    if(f.exists() && !f.isDirectory()) { 
	    	//fileHTML = new FileHandler("Logging.html");
System.out.println(System.getProperty("user.dir")+"\\Logging.html");
	    }else {
	    	System.err.println(System.getProperty("user.dir")+"\\Logging.html");
		}
	}

}
