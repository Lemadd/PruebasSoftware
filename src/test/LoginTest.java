package test;

import java.util.concurrent.TimeUnit;

import logger.MainLogger;

import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.LMAccess.LOCALGROUP_INFO_0;

import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import util.Constants;

public class LoginTest extends MainLogger {
	private WebDriver driver;
	MainPage mainpage;
	LoginPage loginpage;
	DashboardPage dashboardpage;
	
	@BeforeMethod
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.URLMAIN);
		mainpage = new MainPage(driver);
		loginpage = new LoginPage(driver);
		dashboardpage = new DashboardPage(driver);
	}
	
	@Test
  	public void Successful() {
		mainpage.clickOnSignOn();
		loginpage.SignIn(Constants.USERPAGE, Constants.PASSWORDPAGE);
		AssertJUnit.assertTrue(dashboardpage.VerifySuccessfulLogin());
  	}
	
  	@Test
  	public void Unsuccessful() {
		mainpage.clickOnSignOn();
		loginpage.SignIn("asdasdsa", "asdasd");
		AssertJUnit.assertTrue(loginpage.VerifyErrorMessage());
  	}
  	@AfterMethod
  	public void afterTest(){
  		try {
  	  		LOGGER.info("Quiting of the driver");
  	  		driver.quit();
		} catch (Exception e) {
			LOGGER.severe("An error happens trying to quitting the driver");
		}
  		
  	}
  
}
