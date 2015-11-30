package pageObject;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends MainLogger{
	
	@FindBy(className="login")
	private WebElement linkLogin;
	
	@FindBy(className="register")
	private WebElement linkregister;
	
	public MainPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		LOGGER.info("**"+this.getClass().getSimpleName());
	}
	
	public void clickOnRegister(){
		LOGGER.info("***ClickOnRegister");
		linkregister.click();
	}
	public void clickOnSignOn(){
		LOGGER.info("***clickOnSignOn");
		linkLogin.click();
	}
}
