package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEditCustomerPage {
	
	@FindBy(id="Email")
	private WebElement txtEmail;
	
	@FindBy(id="Password")
	private WebElement txtPassword;
	
	@FindBy(id="Gender_Male")
	private WebElement chkMale;
	
	@FindBy(id="Gender_Female")
	private WebElement chkFemale;
	
	@FindBy(id="FirstName")
	private WebElement txtFirstName;
	
	@FindBy(id="LastName")
	private WebElement txtLastName;
	
	@FindBy(id="DateOfBirth")
	private WebElement txtDateOfBirth;
	
	@FindBy(id="Company")
	private WebElement txtCompany;
	
	@FindBy(id="AdminComment")
	private WebElement txtAdminComment;
	
	@FindBy(id="IsTaxExempt")
	private WebElement chkIsTaxExempt;
	
	@FindBy(id="Active")
	private WebElement chkIsActive;
	
	@FindBy(linkText="Customer Roles")
	private WebElement tabCustomerRoles;
	
	@FindBy(xpath="//*[@id='customer-edit-2']//*[contains(., 'Guests')]//input")
	private WebElement chkGuess;
	
	@FindBy(name="save")
	private WebElement btnSave;

	public AddEditCustomerPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
public AddEditCustomerPage() {
		// TODO Auto-generated constructor stub
	}

/**
 * Nuevo Customer
 * @param email
 * @param password
 * @param FirstName
 * @param LastName
 * @param gender
 * @param Date
 * @param Company
 * @param Admin
 * */
	public void NuevoCustomer(
			String email,
			String password,
			String firstName,
			String lastName,
			String gender,
			String dateOfBirth,
			String company,
			String adminComment,
			String isTaxExempt,
			String isActive,
			String isSave){
		
		WriteEmail(email);
		WritePassword(password);
		selectGender(gender);
		WriteFirstName(firstName);
		WriteLastName(lastName);
		WriteDateOfBirth(dateOfBirth);
		WriteCompany(company);
		WriteAdminComment(adminComment);
		clickOnTaxExempt(isTaxExempt);
		SelectGuestRole();
		ClickOnSave(isSave);
	}
	

	
	/**
	 * Metodos de Eventos
	 */
	public void WriteEmail(String email){
		txtEmail.sendKeys(email);
	}
	public void WritePassword(String password){
		txtPassword.sendKeys(password);
	}
	public void WriteFirstName(String firstName){
		txtFirstName.sendKeys(firstName);
	}
	public void WriteLastName(String lastName){
		txtLastName.sendKeys(lastName);
	}
	public void WriteDateOfBirth(String dateOfBirth){
		txtDateOfBirth.sendKeys(dateOfBirth);
	}
	public void WriteCompany(String company){
		txtCompany.sendKeys(company);
	}
	public void WriteAdminComment(String adminComment){
		txtAdminComment.sendKeys(adminComment);
	}
	public void clickOnTaxExempt(String isTaxExempt){
		if (chkIsTaxExempt.isSelected() && isTaxExempt.equalsIgnoreCase("true")) {
			System.out.println("checkbox seleccionado");
		}else {
			chkIsTaxExempt.click();
			System.out.println("checkbox seleccionado");
		}
	}
	private void selectGender(String gender) {
		if (gender.equalsIgnoreCase("Male")) {
			chkMale.click();
		} else if (gender.equalsIgnoreCase("Female")) {
			chkFemale.click();
		} else {
			System.err.println("genero no existe");
		}		
	}
		
	public void SelectGuestRole(){
		tabCustomerRoles.click();
		chkGuess.click();
	}
	
	public void ClickOnSave(String isSave){
		if (isSave.equals("click")) {
			System.out.println("Guardar Customer");
			btnSave.click();
		}else{
			System.err.println("No event Sended");
		}
	}
	
	public void cleanEmail(){
		txtEmail.clear();
	}
}
