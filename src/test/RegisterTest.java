package test;

import java.util.concurrent.TimeUnit;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.RegisterPage;
import util.Constants;
import dataDriven.MySqlDataManager;
import driver.GetDriver;

public class RegisterTest extends MainLogger{
	WebDriver driver;
	MainPage mainpage;
	LoginPage loginpage;
	RegisterPage registerpage;
	GetDriver getDriver=new GetDriver();
	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeTest(String browsers){
		try {
			driver=getDriver.browserType(driver,browsers);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Constants.URLMAIN);
			mainpage = new MainPage(driver);
			loginpage = new LoginPage(driver);
			registerpage = new RegisterPage(driver);
			LOGGER.info("*Driver initialized correctly");
		} catch (Exception e) {
			LOGGER.severe("*An error happen trying to initializing the driver");
		}
	}

	@Test(dataProvider="registerpage")
  	public void Test(String idTestCase,
  						   String username,
  						   String password,
  						   String confirmPassword,
  						   String firstName,
  						   String LastName,
  						   String email,
  						   String language,
  						   String country,
  						   String company,
  						   String website) {
		LOGGER.info("**Executing TestCase T" +idTestCase);
		mainpage.clickOnRegister();
		registerpage.insertNewUser(username,
								   password,
								   confirmPassword,
								   firstName,
								   LastName,
								   email,
								   language,
								   country,
								   company,
								   website);
		if (username.equalsIgnoreCase("novalido")) {
			registerpage.verifyErrorMessage();
		}else if (username.equalsIgnoreCase("novalido")) {
			registerpage.verifyErrorMessage();
		}else if (username.equalsIgnoreCase("novalido")) {
			registerpage.verifyErrorMessage();
		}else if (username.equalsIgnoreCase("novalido")) {
			registerpage.verifyErrorMessage();
		}
  	}
	
	@DataProvider(name="registerpage")
	public Object[][] sendDataMySqlCustomers() {
		try {
			LOGGER.info("**sendDataMySqlCustomers");
			MySqlDataManager mySqlDataManager = new MySqlDataManager();
			Object[][] arrData = mySqlDataManager.getMySqlTable("registerpage");
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
