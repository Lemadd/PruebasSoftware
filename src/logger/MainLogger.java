package logger;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.rules.TestWatchman;
import org.junit.runner.Description;

public class MainLogger {
	public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	  
	 public MainLogger(){
		 try {
			MyLogger.setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	  
}
