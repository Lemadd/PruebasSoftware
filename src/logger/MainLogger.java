package logger;

import java.io.IOException;
import java.util.logging.Logger;

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
