package pageObject.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import logger.MainLogger;

public class NewProjectPage extends MainLogger{
	
	@FindBy(id="project_name")
	WebElement txtNameProject;
	
	@FindBy(id="project_description")
	WebElement txtDescription;
	
	@FindBy(id="project_identifier")
	WebElement txtIdentifier;
	
	@FindBy(id="project_homepage")
	WebElement txtHomePage;
	
	@FindBy(id="project_is_public")
	WebElement chkIsPublic;
	
	@FindBy(id="project_parent_id")
	WebElement cboParentProject;
	
	@FindBy(id="project_inherit_members")
	WebElement chkInheritMembers;
	
	public NewProjectPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
		LOGGER.info(this.getClass().getSimpleName());
	}
	
	public void WriteNameProject(String name){
		txtNameProject.sendKeys(name);
	}
	
	public void WriteDescription(String description){
		txtDescription.sendKeys(description);
	}
	public void WriteHomePage(String homepage){
		txtHomePage.sendKeys(homepage);
	}
	
	public void WriteIdentifier(String identifier){
		if (identifier!=null) {
			if (txtIdentifier.getText()!=null) {
				txtIdentifier.clear();
				txtIdentifier.sendKeys(identifier);
			}else
			{
				txtIdentifier.sendKeys(identifier);
			}
		}
	}
	
	public void ClickOnChkIsPublic(String isChecked){
		if (isChecked.equalsIgnoreCase("true")) {
			chkIsPublic.click();
		}
	}
	
	public void ClickOnChkInheritMembers(String isChecked){
		if (isChecked.equalsIgnoreCase("true")) {
			chkInheritMembers.click();
		}
	}
}
