package driver;

import java.util.concurrent.TimeUnit;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class GetDriver extends MainLogger{
	
	public WebDriver browserType(WebDriver driverw, String nameDriver){
		try {
			if (nameDriver.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--lang=es");
				driverw = new  ChromeDriver(options);
			}else if (nameDriver.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"src/operadriver32.exe");    
				driverw = new  OperaDriver();
			}else if (nameDriver.equalsIgnoreCase("firefox")) {
				driverw=new FirefoxDriver();
			}else if (nameDriver.equalsIgnoreCase("ie")) {
				driverw=new InternetExplorerDriver();
			}
			driverw.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driverw.manage().window().maximize();
			
			return driverw;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			LOGGER.severe("algo ocurrio mal");
			return null;
		}

		
	}
}
