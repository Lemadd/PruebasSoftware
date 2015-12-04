package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import util.Constants;

public class GetDriver {
	
	public WebDriver browserType(String nameDriver){
		WebDriver driver = null;
		Constants.BROWSER="opera";
		if (Constants.BROWSER=="chrome") {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src/chromedriver.exe");
			driver = new  ChromeDriver();
		}if (Constants.BROWSER=="opera") {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"src/operadriver32.exe");    
			driver = new  ChromeDriver();
		}if (Constants.BROWSER=="firefox") {
			driver=new FirefoxDriver();
		}if (Constants.BROWSER=="ie") {
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
	}
}
