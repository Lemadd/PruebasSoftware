package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.MainCommerceTest;

public class DashboardPage {

	private MainCommerceTest commerceTest;
	
	@FindBy(className="login-info")
	private WebElement lblLoggedIn;
	
	@FindBy(xpath=".//*[@id='admin-menu']/li[4]")
	private WebElement btnCustomers;
	
	@FindBy(linkText="Customers")
	private WebElement opCustomers;
	
	Actions builder;
	
	public DashboardPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		builder= new Actions(webDriver);
	}
	
	public void GoToCustomersPage() {		
	    Action mouseOverHome = builder
	                .moveToElement(btnCustomers)
	                .build();
	    mouseOverHome.perform();
		opCustomers.click();
	}
	
	
	public boolean checkLoggedIn () {
		String elementText = lblLoggedIn.getText();
		if (elementText.contains("Logged in as:")){
			System.out.println("Ingreso al sistema");
			return true;
		} else {
			System.err.println("Error al ingresar al sistema");
			return false;
		}
	}
	
}
