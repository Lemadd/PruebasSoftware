package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






import test.MainCommerceTest;

public class CustomersPage extends AddEditCustomerPage{
	
	@FindBy(linkText="Add new")
	private WebElement btnAddNew;
	
	@FindBy(xpath="//td[2]/input[3]")
	private WebElement chkGuess2;
	
	@FindBy(id="SearchEmail")
	private WebElement txtSearhEmail;
	
	@FindBy(id="SearchFirstName")
	private WebElement txtSearchFirstName;
	
	@FindBy(id="SearchLastName")
	private WebElement txtSearchLastName;
	
	@FindBy(id="SearchCompany")
	private WebElement txtSearchCompany;
	
	@FindBy(id="search-customers")
	private WebElement btnSearch;
	
	@FindBy(xpath="//*[@id='customers-grid']/table/tbody/tr[1]//td[3]")
	private WebElement trEmail;
	
	@FindBy(xpath="//*[@id='customers-grid']/table/tbody/tr[1]//td[4]")
	private WebElement trName;
	
	@FindBy(xpath="//*[@id='customers-grid']/table/tbody/tr[1]//td[6]")
	private WebElement trCompanyName;
	
	@FindBy(xpath="//*[@id='customers-grid']/table/tbody/tr[1]//td[10]/a")
	private WebElement editLink;
	
	public CustomersPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void AddNewCustomerButton(){
		btnAddNew.click();	
	}
	public void EditCustomer(String email,
			String password,
			String firstName,
			String lastName,
			String gender,
			String dateOfBirth,
			String company,
			String adminContent,
			String isTaxExemt,
			String isActive,
			String isSave){
		editLink.click();
		cleanEmail();
		WriteEmail("test_updated@test.com");
		ClickOnSave(isSave);
	}
	public boolean verifyUser(String email,
			String firstName,
			String lastName,
			String company){
		try {
			String fullName,trEmailText,trFullNameText,trcompanyText;
			chkGuess2.click();
			txtSearhEmail.sendKeys(email);
			txtSearchFirstName.sendKeys(firstName);
			txtSearchLastName.sendKeys(lastName);
			txtSearchCompany.sendKeys(company);
			btnSearch.click();
			fullName=firstName +" " + lastName;
			
			trEmailText=trEmail.getText();
			if (trEmailText.equalsIgnoreCase("Guest")){
				email=trEmailText;
			}
			trFullNameText=trName.getText();
			trcompanyText=trCompanyName.getText();
			if (email.equalsIgnoreCase(trEmailText) &&
					fullName.equalsIgnoreCase(trFullNameText) &&
					company.equalsIgnoreCase(trcompanyText)) {
				System.err.println("Usuario Encontrado");
				return true;
			}
			else{
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Usuario no Encontrado");
			return false;
		}
	}

}
