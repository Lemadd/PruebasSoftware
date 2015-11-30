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
		LOGGER.info("**"+this.getClass().getSimpleName());
	}
	
	public void insertNews(String title, String summary, String description){
		LOGGER.info("***insertNews" + " params "+title + " - "+summary + " - " + description);
		writeTitle(title);
		writeSummary(summary);
		writeDescription(description);
		clickOnBtnCommit();
	}
	public void writeTitle(String title){
		if (title.equalsIgnoreCase(title)) {
			title="";
			LOGGER.info("***writeTitle : "+title);
			txtTitle.sendKeys(title);
		}else{
			LOGGER.info("***writeTitle : "+title);
			txtTitle.sendKeys(title);
		}
	}
	
	public void writeSummary(String summary){
		if (summary.equalsIgnoreCase(summary)) {
			summary="";
			LOGGER.info("***writeSummary : "+summary);
			txtSummary.sendKeys(summary);
		}else{
			LOGGER.info("***writeSummary : "+summary);
			txtSummary.sendKeys(summary);
		}
	}
	
	public void writeDescription(String description){
		if (description.equalsIgnoreCase(description)) {
			description="";
			LOGGER.info("***writeDescription : "+description);
			txtDescription.sendKeys(description);
		}else{
			LOGGER.info("***writeDescription : "+description);
			txtDescription.sendKeys(description);
		}
	}
	
	public void clickOnBtnCommit(){
		LOGGER.info("***clickOnBtnCommit");
		btnCommit.click();
	}
}
