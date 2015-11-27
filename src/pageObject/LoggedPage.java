package pageObject;

import logger.MainLogger;
import org.apache.log.util.LoggerOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedPage extends MainLogger {
		
	@FindBy(className="home")
	private WebElement linkHome;
	
	@FindBy(className="my-page")
	private WebElement linkmyPage;
	
	@FindBy(className="projects")
	private WebElement linkmyProjects;
	
	@FindBy(className="help")
	private WebElement linkHelp;
	
	@FindBy(id="loggedas")
	private WebElement lblLogged;
	
	@FindBy(className="my-account")
	private WebElement linkMyAccount;
	
	@FindBy(className="logout")
	private WebElement linkLogout;
	
	public LoggedPage(WebDriver webdriver){
		PageFactory.initElements(webdriver, this);
		LOGGER.info(this.getClass().getSimpleName());
	}
	
	public void ClickOnHome(){
		LOGGER.info("ClickOnHome");
		linkHome.click();
	}
	public void ClickOnMyPage(){
		LOGGER.info("ClickOnHome");
		linkmyPage.click();
	}
	public void ClickOnMyProjects(){
		LOGGER.info("ClickOnMyProjects");
		linkmyProjects.click();
	}
	public void ClickOnHelp(){
		LOGGER.info("ClickOnHelp");
		linkHelp.click();
	}
	public void ClickOnMyAccount(){
		LOGGER.info("ClickOnMyAccount");
		linkMyAccount.click();
	}
	public void ClickOnLogOut(){
		LOGGER.info("ClickOnLogOut");
		linkLogout.click();
	}

}
