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
		LOGGER.info("**"+this.getClass().getSimpleName());
	}
	
	public void clickOnHome(){
		LOGGER.info("***clickOnHome");
		linkHome.click();
	}
	public void clickOnMyPage(){
		LOGGER.info("***clickOnHome");
		linkmyPage.click();
	}
	public void clickOnMyProjects(){
		LOGGER.info("***clickOnMyProjects");
		linkmyProjects.click();
	}
	public void clickOnHelp(){
		LOGGER.info("***clickOnHelp");
		linkHelp.click();
	}
	public void clickOnMyAccount(){
		LOGGER.info("***clickOnMyAccount");
		linkMyAccount.click();
	}
	public void clickOnLogOut(){
		LOGGER.info("***clickOnLogOut");
		linkLogout.click();
	}

}
