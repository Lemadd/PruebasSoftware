package test;

import java.util.concurrent.TimeUnit;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataDriven.MySqlDataManager;
import driver.GetDriver;
import pageObject.AddNewsPage;
import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import util.Constants;

public class AddNewsTest extends MainLogger {
	WebDriver driver;
	MainPage mainpage;
	LoginPage loginpage;
	DashboardPage dashboardpage;
	AddNewsPage addNewsPage;
	
	GetDriver getDriver=new GetDriver();
	@BeforeMethod
	@Parameters({ "browser" })
	public void beforeTest(){
		driver=getDriver.browserType(driver,"firefox");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.URLMAIN);
		mainpage = new MainPage(driver);
		loginpage = new LoginPage(driver);
		dashboardpage = new DashboardPage(driver);
		addNewsPage=new AddNewsPage(driver);
	}
	@Test(dataProvider="addnewspage")
  	public void test(String idTest,String title, String summary, String description) {
		LOGGER.info("**Executing Test Case " + idTest);
		mainpage.clickOnSignOn();
		loginpage.signIn(Constants.USERPAGE, Constants.PASSWORDPAGE);
		
		driver.get("http://www.hostedredmine.com/projects/pruebacibertec/news/new");
		
		
		addNewsPage.insertNews(title, summary, description);
		
		switch (idTest) {
		case "1": 
			AssertJUnit.assertTrue(addNewsPage.veifySuccesfulMessage());
			break;
		case "2": 
			AssertJUnit.assertTrue(addNewsPage.veifySuccesfulMessage());
			break;
		case "3": 
			AssertJUnit.assertTrue(addNewsPage.veifySuccesfulMessage());
			break;
		case "4": 
			AssertJUnit.assertTrue(addNewsPage.verifyErrorMessage());
			break;
		default:
			AssertJUnit.assertTrue(addNewsPage.verifyErrorMessage());
			break;
		}
		
	}
	@DataProvider(name="addnewspage")
	public Object[][] sendDataMySqlCustomers() {
		try {
			LOGGER.info("**sendDataMySqlCustomers");
			MySqlDataManager mySqlDataManager = new MySqlDataManager();
			Object[][] arrData = mySqlDataManager.getMySqlTable("addnewspage");
			return arrData;
		} catch (Exception e) {
			LOGGER.severe("An error in sendDataMySqlCustomers method happens");
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
