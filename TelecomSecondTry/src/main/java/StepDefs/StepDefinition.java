package StepDefs;

import java.io.IOException;

import Base.TestBase;
import Pages.AccessDetailsPage;
import Pages.AddCustomerPage;
import Pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends TestBase {

	public StepDefinition() throws IOException {
		super();
	}

	HomePage homePageObj;
	AddCustomerPage addCustomerPageObj;
	AccessDetailsPage accessDetailsPageObj;

	@Before
	public void launchBrowser() {
		TestBase.setUp();
	}

	@Given("user is on HomePage")
	public void user_is_on_HomePage() {
		TestBase.initializeBrowser();
	}

	@When("user clicks on add customer link")
	public void user_clicks_on_add_customer_link() throws IOException {
		homePageObj = new HomePage();
		addCustomerPageObj = homePageObj.clickonAddCustomerLink();
	}

//	@Then("Then user fills details in add customer page by entering \"(.*)\" and \"(.*)\" "
//			+ "and \"(.*)\" and \"(.*)\" and \"(.*)\"")
//
//	public void user_fills_details_in_add_customer_page(String fn, String ln, String ml, String addrs, String phNum) {
//		accessDetailsPageObj = addCustomerPageObj.fillCustomerDetails(fn, ln, ml, addrs, phNum);
//
//	}

	@Then("user fills details in add customer page by entering \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void user_fills_details_in_add_customer_page_by_entering_and_and_and_and(String fn, String ln, String ml,
			String add, String num) throws IOException {
		accessDetailsPageObj = addCustomerPageObj.fillCustomerDetails(fn, ln, ml, add, num);
	}

	@Then("user gets Customer Id")
	public void user_gets_Customer_Id() {
		String customerId = accessDetailsPageObj.getCustomerId();
		System.out.println("Customer Id = " + customerId);
	}

	@After
	public void closeBrowser() {
		TestBase.tearDown();
	}

}
