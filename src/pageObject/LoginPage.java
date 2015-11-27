package pageObject;

import logger.MainLogger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Constants;

public class LoginPage extends MainLogger{

	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnLogIn;
	
	@FindBy(id="flash_error")
	private WebElement errorMessage;
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		LOGGER.info(this.getClass().getSimpleName());
	}
	
	public void WriteUserName(String userName){
		LOGGER.info("WriteUserName : "+userName);
		txtUserName.sendKeys(userName);
	}
	public void WritePassword(String password){
		LOGGER.info("WritePassword : "+password);
		txtPassword.sendKeys(password);
	}
	public void ClickOnLogIn(){
		LOGGER.info("ClickOnLogIn");
		btnLogIn.click();
	}
	
	public void SignIn(String userName, String password) {
		try {
			LOGGER.info("SignInMethod");
			txtUserName.sendKeys(userName);
			txtPassword.sendKeys(password);
			btnLogIn.click();
		} catch (Exception e) {
			LOGGER.severe("An error happen when trying to Sign In with "+userName+" - "+password );
		}
	}
	
	public boolean VerifyErrorMessage(){
		String errorMessageText;
		try {
			LOGGER.info("VerifyErrorMessageMethod");
			//errorMessage.findElement(By.className(("flash error")));
			errorMessageText=errorMessage.getText();
			if (errorMessageText.equalsIgnoreCase(Constants.LOGIN_ERROR_ES)) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			LOGGER.severe("An error happen when trying to find the error message" );
			return false;
		}
	}
}
