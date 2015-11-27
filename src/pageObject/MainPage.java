package pageObject;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends MainLogger{
	@FindBy(className="login")
	private WebElement linkLogin;
	
	public MainPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public void clickOnLink(){
		LOGGER.info("Click en SignOn");
		linkLogin.click();
	}
}
