package pageObject;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends MainLogger{

	@FindBy(id="loggedas")
	private WebElement lblLoggedAs;
	
	public DashboardPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		LOGGER.info("**"+this.getClass().getSimpleName());
	}
	
	public boolean verifySuccessfulLogin () {
		LOGGER.info("***verifySuccessfulLogin()");
		String elementText = lblLoggedAs.getText();
		if (elementText.contains("Conectado como")){
			LOGGER.info("***Ingreso a la pagina correctament");
			return true;
		} else {
			LOGGER.severe("***Ocurrio un erro al intentar Loguearse");
			return false;
		}
	}
	
}
