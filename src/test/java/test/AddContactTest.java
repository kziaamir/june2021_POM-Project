package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {

	WebDriver driver;

//	String userName = "demo@techfios.com";
//	String password = "abc123";

	@Test
	public void validUserShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();

		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.insertFullName("TestNG");
		addContactPage.selectCompany("Techfios");
		addContactPage.insertEmail("ABC234@techfios.com");
		addContactPage.inserrtPhone("4698542122");
		addContactPage.selectCountry("Angola");

	}

}
