package test;

import java.util.concurrent.TimeUnit;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDriven.MySqlDataManager;
import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.RegisterPage;
import util.Constants;

public class RegisterTest extends MainLogger{
	private WebDriver driver;
	MainPage mainpage;
	LoginPage loginpage;
	RegisterPage registerpage;
	
	@BeforeMethod
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.URLMAIN);
		mainpage = new MainPage(driver);
		loginpage = new LoginPage(driver);
		registerpage = new RegisterPage(driver);
	}

	@Test(dataProvider="registerPage")
  	public void Successful(String idTestCase,
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
		mainpage.ClickOnRegister();
		registerpage.InsertNewUser(username,
								   password,
								   confirmPassword,
								   firstName,
								   LastName,
								   email,
								   language,
								   country,
								   company,
								   website);
		if (condition) {
			
		}
  	}
	
	
	@DataProvider(name="registerPage")
	public Object[][] sendDataMySqlCustomers() {
		try {
			MySqlDataManager mySqlDataManager = new MySqlDataManager();
			Object[][] arrData = mySqlDataManager.getMySqlTable("registerpage");
			return arrData;
		} catch (Exception e) {
			LOGGER.severe("An error in sendDataMySqlCustomers method happens");
			return null;
		}

	}
}
