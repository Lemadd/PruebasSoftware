package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import util.Constants;

public class LoginTest {
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
  
}
