package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Constants;
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
	
	@FindBy(name="commit")
	private WebElement btnSave;
	
	@FindBy(id="errorExplanation")
	private WebElement errorMessage;
	
	public RegisterPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
		LOGGER.info("**"+this.getClass().getSimpleName());
	}
	
	public void insertNewUser(String username,
							  String password,
							  String confirmPassword,
							  String firstName,
							  String LastName,
							  String email,
							  String language,
							  String country,
							  String company,
							  String website){
		LOGGER.info("**insertNewUser params "+username+ " - "
											+password+ " - "
											+confirmPassword+ " - "
											+firstName+ " - "
											+LastName+ " - "
											+email+ " - "
											+language+ " - "
											+country+ " - "
											+company+ " - "
											+website);
		writeUserName(username);
		writePassword(password);
		writePasswordConfirmation(confirmPassword);
		writeFirstName(firstName);
		writeLastName(LastName);
		writeEmail(email);
		writeLastName(language);
		writeCountry(country);
		writeWebSite(website);
		clickOnSave();
	}
	
	public void writeUserName(String username){
		if (username.equalsIgnoreCase("novalido")) {
			username="";
			LOGGER.info("***writeUserName : "+username);
			txtUserName.sendKeys(username);
		}else {
			LOGGER.info("***writeUserName : "+username);
			txtUserName.sendKeys(username);
		}
	}
	
	public void writePassword(String password){
		if (password.equalsIgnoreCase("novalido")) {
			password="";
			LOGGER.info("***writePassword : "+password);
			txtPassword.sendKeys(password);
		}else {
			LOGGER.info("***writePassword : "+password);
			txtPassword.sendKeys(password);;
		}
	}
	
	public void writePasswordConfirmation(String password){
		if (password.equalsIgnoreCase("novalido")) {
			password="";
			LOGGER.info("***writePasswordConfirmation : "+password);
			txtPasswordConfirmation.sendKeys(password);
		}else {
			LOGGER.info("***writePasswordConfirmation : "+password);
			txtPasswordConfirmation.sendKeys(password);
		}
	}
	
	public void writeFirstName(String firstname) {
		if (firstname.equalsIgnoreCase("novalido")) {
			firstname="";
			LOGGER.info("***writeFirstName : "+firstname);
			txtFirstName.sendKeys(firstname);
		}else {
			LOGGER.info("***writeFirstName : "+firstname);
			txtFirstName.sendKeys(firstname);
		}
	}
	
	public void writeLastName(String lastname){
		if (lastname.equalsIgnoreCase("novalido")) {
			lastname="";
			LOGGER.info("WriteLastName : "+lastname);
			txtLastName.sendKeys(lastname);
		}else {
			LOGGER.info("WriteLastName : "+lastname);
			txtLastName.sendKeys(lastname);
		}
	}
	
	public void writeEmail(String email){
		if (email.equalsIgnoreCase("novalido")) {
			email="";
			LOGGER.info("***writeEmail : "+email);
			txtEmail.sendKeys(email);
		}else {
			LOGGER.info("***writeEmail : "+email);
			txtEmail.sendKeys(email);
		}
	}
	
	public void selectOptionOnLanguage(String language){
		if (language.equalsIgnoreCase("novalido")) {
			language="";
			LOGGER.info("***selectOptionOnLanguage : "+language);
			cboLanguage.selectByVisibleText(language);
		}else {

			LOGGER.info("***selectOptionOnLanguage : "+language);
			cboLanguage.selectByVisibleText(language);
		}
	}
	
	public void writeCountry(String country){
		if (country.equalsIgnoreCase("novalido")) {
			country="";
			LOGGER.info("***WriteCountry : "+country);
			txtCountry.sendKeys(country);
		}else {
			LOGGER.info("***WriteCountry : "+country);
			txtCountry.sendKeys(country);
		}
	}
	
	public void writeCompany(String company){
		if (company.equalsIgnoreCase("novalido")) {
			company="";
			LOGGER.info("***writeCompany : "+company);
			txtCompany.sendKeys(company +this);
		}else {
			LOGGER.info("***writeCompany : "+company);
			txtCompany.sendKeys(company +this);
		}
	}
	
	public void writeWebSite(String website){
		if (website.equalsIgnoreCase("novalido")) {
			website="";
			LOGGER.info("***writeWebSite : "+website);
			txtWebsite.sendKeys(website);
		}else {
			LOGGER.info("***writeWebSite : "+website);
			txtWebsite.sendKeys(website);
		}
	}
	
	public void clickOnSave(){
		btnSave.click();
	}
	
	/*
	 * Methods to verify error messages
	 */
	public boolean verifyErrorMessage(){
		try {
			LOGGER.info("***verifyErrorMessage");
			if (errorMessage.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			LOGGER.severe("***An error happen when trying to find the error message" );
			return false;
		}
	}
	
}
