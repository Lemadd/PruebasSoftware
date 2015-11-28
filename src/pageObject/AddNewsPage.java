package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import logger.MainLogger;

public class AddNewsPage extends MainLogger {
	@FindBy(id="news_title")
	private WebElement txtTitle;
	
	@FindBy(id="news_summary")
	private WebElement txtSummary;
	
	@FindBy(id="news_description")
	private WebElement txtDescription;
	
	@FindBy(name="commit")
	private WebElement btnCommit;
	
	public AddNewsPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, this);
	}
	
	public void InsertNews(String title, String summary, String description){
		LOGGER.info("InsertNews");
		WriteTitle(title);
		WriteSummary(summary);
		WriteDescription(description);
		ClickOnBtnCommit();
	}
	public void WriteTitle(String title){
		if (title.equalsIgnoreCase(title)) {
			title="";
			LOGGER.info("WriteTitle : "+title);
			txtTitle.sendKeys(title);
		}else{
			LOGGER.info("WriteTitle : "+title);
			txtTitle.sendKeys(title);
		}
	}
	
	public void WriteSummary(String summary){
		if (summary.equalsIgnoreCase(summary)) {
			summary="";
			LOGGER.info("WriteSummary : "+summary);
			txtSummary.sendKeys(summary);
		}else{
			LOGGER.info("WriteSummary : "+summary);
			txtSummary.sendKeys(summary);
		}
	}
	
	public void WriteDescription(String description){
		if (description.equalsIgnoreCase(description)) {
			description="";
			LOGGER.info("WriteDescription : "+description);
			txtDescription.sendKeys(description);
		}else{
			LOGGER.info("WriteDescription : "+description);
			txtDescription.sendKeys(description);
		}
	}
	
	public void ClickOnBtnCommit(){
		btnCommit.click();
	}
}
