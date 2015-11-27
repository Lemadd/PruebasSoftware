package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import logger.MainLogger;

public class RegisterPage extends MainLogger{
	
	@FindBy(id="user_login")
	private WebElement txtUserName;
	
	@FindBy(id="user_password")
	private WebElement txtPassword;
	
	@FindBy(id="user_password_confirmation")
	private WebElement txtPasswordConfirmation;
	
	@FindBy(id="user_firstname")
	private WebElement txtFirstName;
	
	@FindBy(id="user_lastname")
	private WebElement txtLastName;
	
	@FindBy(id="user_mail")
	private WebElement txtEmail;
	
	@FindBy(id="user_language")
	private Select cboLanguage;
	
	@FindBy(id="user_custom_field_values_1")
	private WebElement txtCountry;
	
	@FindBy(id="user_custom_field_values_3")
	private WebElement txtCompany;
	
	@FindBy(id="user_custom_field_values_4")
	private WebElement txtWebsite;
	
	public RegisterPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
		LOGGER.info(this.getClass().getSimpleName());
	}
	
	public void InsertNewUser(String username,
							  String password,
							  String confirmPassword,
							  String firstName,
							  String LastName,
							  String email,
							  String language,
							  String country,
							  String company,
							  String website){
		LOGGER.info("InsertNewUser");
		WriteUserName(username);
		WritePassword(password);
		WritePasswordConfirmation(confirmPassword);
		WriteFirstName(firstName);
		WriteLastName(LastName);
		WriteEmail(email);
		WriteLastName(language);
		WriteCountry(country);
		WriteWebSite(website);
	}
	
	public void WriteUserName(String username){
		LOGGER.info("WriteUserName : "+username);
		txtUserName.sendKeys(username);
	}
	
	public void WritePassword(String password){
		LOGGER.info("WriteUserName : "+password);
		txtPassword.sendKeys(password);
	}
	
	public void WritePasswordConfirmation(String password){
		LOGGER.info("WritePasswordConfirmation : "+password);
		txtPasswordConfirmation.sendKeys(password);
	}
	
	public void WriteFirstName(String firstname) {
		txtFirstName.sendKeys(firstname);
	}
	
	public void WriteLastName(String lastname){
		txtLastName.sendKeys(lastname);
	}
	
	public void WriteEmail(String email){
		txtEmail.sendKeys(email);
	}
	
	public void SelectOptionOnLanguage(String language){
		cboLanguage.selectByVisibleText(language);;
	}
	
	public void WriteCountry(String country){
		txtCountry.sendKeys(country);
	}
	
	public void WriteCompany(String company){
		txtCompany.sendKeys(company);
	}
	
	public void WriteWebSite(String website){
		txtWebsite.sendKeys(website);
	}
}
