package test;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDriven.MySqlDataManager;
import pageObject.AddEditCustomerPage;
import pageObject.CustomersPage;
import pageObject.DashboardPage;
import pageObject.LoginPage;
import util.Constants;

public class MainCommerceTest {
	private WebDriver driver;
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private CustomersPage customersPage;
	private AddEditCustomerPage addcustomerPage;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.URLMAIN);
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		customersPage = new CustomersPage(driver);
		addcustomerPage = new AddEditCustomerPage(driver);
	}
	
	@Test(dataProvider="customers")
	public void test(
			String idCase,
			String email,
			String password,
			String firstName,
			String lastName,
			String gender,
			String dateOfBirth,
			String company,
			String adminContent,
			String isTaxExemt,
			String isActive,
			String isSave
			){
		System.out.println("Ejecutando Test Case: " + idCase);
		//loginPage.enterLogIn(Constants.USERPAGE, Constants.PASSWORDPAGE);
		if (idCase.equalsIgnoreCase("TC001")) {
			//dashboardPage.GoToCustomersPage();
			customersPage.AddNewCustomerButton();
			addcustomerPage.NuevoCustomer(email,
										password,
										firstName,
										lastName,
										gender,
										dateOfBirth,
										company,
										adminContent,
										isTaxExemt,
										isActive,
										isSave);
			Assert.assertTrue(customersPage.verifyUser(email, firstName, lastName, company));
			System.out.println("Usuario " + email +" Creado exitosamente");
		
		}else if (idCase.equalsIgnoreCase("TC002")) {
			//dashboardPage.GoToCustomersPage();
			customersPage.AddNewCustomerButton();
			addcustomerPage.NuevoCustomer(email,
										password,
										firstName,
										lastName,
										gender,
										dateOfBirth,
										company,
										adminContent,
										isTaxExemt,
										isActive,
										isSave);
			Assert.assertTrue(customersPage.verifyUser(email, firstName, lastName, company));
			System.out.println("Usuario " + firstName +" Creado exitosamente");

			customersPage.EditCustomer(email,
											password,
											firstName,
											lastName,
											gender,
											dateOfBirth,
											company,
											adminContent,
											isTaxExemt,
											isActive,
											isSave);

			Assert.assertTrue(customersPage.verifyUser("test_updated@test.com", firstName, lastName, company));
			System.out.println("Usuario " + firstName +" Editado exitosamente");
		}
	}

	@DataProvider(name="customers")
	public Object[][] sendDataMySqlCustomers() {
		try {
			MySqlDataManager mySqlDataManager = new MySqlDataManager();
			Object[][] arrData = mySqlDataManager.getMySqlTable("tb_customer");
			return arrData;
		} catch (Exception e) {
			System.err.println("No se puede leer la tabla tb_user ");
			return null;
		}

	}
}
