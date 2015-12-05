package test;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import util.Constants;
import dataDriven.MySqlDataManager;
import driver.GetDriver;

public class LoginTest extends MainLogger {
	MainPage mainpage;
	LoginPage loginpage;
	DashboardPage dashboardpage;
	GetDriver getDriver=new GetDriver();
	WebDriver driver,drivers;
		
	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeTest(String browser){
		try {
			driver=getDriver.browserType(drivers,browser);
			driver.get(Constants.URLMAIN);
			mainpage = new MainPage(driver);
			loginpage = new LoginPage(driver);
			dashboardpage = new DashboardPage(driver);
			LOGGER.info("*Driver initialized correctly");
		} catch (Exception e) {
			LOGGER.severe("*An error happen trying to initializing the driver");
		}
	}
	
	@Test(dataProvider="loginpage", testName="loginTest")
  	public void login(String idTest, String username, String password ) {
		LOGGER.info("**Executing Test Case " + idTest);
		mainpage.clickOnSignOn();
		loginpage.signIn(username, password);
		if (Integer.parseInt(idTest)==1) {
			AssertJUnit.assertTrue(dashboardpage.verifySuccessfulLogin());
		}else {
			AssertJUnit.assertTrue(loginpage.verifyErrorMessage());
		}
  	}
  	
  	@DataProvider(name="loginpage")
	public Object[][] sendDataMySqlCustomers() {
		try {
			LOGGER.info("*The datadriver couldn't load correctly");
			MySqlDataManager mySqlDataManager = new MySqlDataManager();
			Object[][] arrData = mySqlDataManager.getMySqlTable("loginpage");
			return arrData;
		} catch (Exception e) {
			LOGGER.severe("*An error in sendDataMySqlCustomers method happens");
			return null;
		}
	}
  	
  	@AfterMethod
  	public void afterTest(){
  		try {
  	  		LOGGER.info("*Quiting of the driver");
  	  		driver.quit();
		} catch (Exception e) {
			LOGGER.severe("*An error happens trying to quitting the driver");
		}
  	}
  
}
