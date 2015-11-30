package logger;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UseLogger extends MainLogger {
	  // use the classname for the logger, this way you can refactor
	  //private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	  

	  public static void doSomeThingAndLog() {
	    // ... more code

	    // now we demo the logging

	    // set the LogLevel to Severe, only severe Messages will be written
	    LOGGER.severe("Info Log");
	    LOGGER.warning("Info Log");
	    LOGGER.info("Info Log");
	    LOGGER.finest("Really not important");

	    // set the LogLevel to Info, severe, warning and info will be written
	    // finest is still not written
	    LOGGER.severe("Info Log");
	    LOGGER.warning("Info Log");
	    LOGGER.info("Info Log");
	    LOGGER.setLevel(Level.FINEST);
	  }

	  public static void main(String[] args) {
	    UseLogger tester = new UseLogger();
	    doSomeThingAndLog();
	  }

}
