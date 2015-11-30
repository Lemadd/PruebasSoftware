package pageObject.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import logger.MainLogger;

public class ProjectsPage extends MainLogger{
	
	@FindBy(className="icon icon-add")
	private WebElement  linkNewProject;
	
	@FindBy(linkText="/issues")
	private WebElement  linkSeeAllPetions;
	
	@FindBy(linkText="/time_entries")
	private WebElement  linkTimeEntries;
	
	@FindBy(linkText="/activity")
	private WebElement  linkActivity;
	
	@FindBy(className="button-small")
	private WebElement  btnDone;
	
	@FindBy(id="project_quick_jump_box")
	private WebElement goToProjects;
	
	public ProjectsPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
		LOGGER.info("**"+this.getClass().getSimpleName());
	}
	
	public void ClickOnNewProject(){
		LOGGER.info("***ClickOnNewProject");
		linkNewProject.click();
	}
}
