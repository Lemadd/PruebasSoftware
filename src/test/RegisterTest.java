package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.RegisterPage;
import util.Constants;

public class RegisterTest {
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
	
	@Test
  	public void Successful() {
		mainpage.ClickOnRegister();
		registerpage.InsertNewUser("cibertecpruebs",
									"cibertecpruebs",
									"cibertecpruebs",
									"cibertecpruebs",
									"cibertecpruebs",
									"cibertecpruebs@cibertecpruebs.com",
									"English",
									"cibertecpruebs",
									"cibertecpruebs",
									"cibertecpruebs");
  	}
	
}
