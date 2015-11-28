package test;

import java.util.concurrent.TimeUnit;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDriven.MySqlDataManager;
import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import util.Constants;

public class AddNewsTest extends MainLogger {
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
		
	}
	@DataProvider(name="addnewspage")
	public Object[][] sendDataMySqlCustomers() {
		try {
			LOGGER.info("The datadriver couldn't load correctly");
			MySqlDataManager mySqlDataManager = new MySqlDataManager();
			Object[][] arrData = mySqlDataManager.getMySqlTable("registerpage");
			return arrData;
		} catch (Exception e) {
			LOGGER.severe("An error in sendDataMySqlCustomers method happens");
			return null;
		}
	}
}
