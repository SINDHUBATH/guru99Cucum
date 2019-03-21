package StepDefs;

import java.io.IOException;
import java.util.Set;

import org.junit.Assert;

import Base.TestBase;
import PaymentGatewayPages.CardNumPage;
import PaymentGatewayPages.PaymentGWHomepage;
import PaymentGatewayPages.PaymentProcessPage;
import PaymentGatewayPages.PaymentSuccessPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PaymentStepDef extends TestBase {

	String expYear;
	String expMonth;
	String cardNum;
	String cvv;
	String parentwindowHandle;
	TestBase testBaseobj = new TestBase();
	PaymentGWHomepage paymentGWHomepageObj;
	PaymentProcessPage paymentProcessPageObj;
	CardNumPage cardNumPageObj;
	PaymentSuccessPage paymentSuccessPageObj;

	public PaymentStepDef() throws IOException {
		super();
	}

	@Before
	public void launchBrowser() {
		TestBase.setUp();
	}

	@Given("user is on paymentGatewayHomePage")
	public void user_is_on_paymentGatewayHomePage() {
		driver.get(prop.getProperty("paymentGatewayUrl"));
		String title = driver.getTitle();
		parentwindowHandle = driver.getWindowHandle();
		Assert.assertEquals("Guru99 Payment Gateway", title); // Check Page Title
	}

	@Then("user selects quantity and click on Buy Now Button")
	public void user_selects_quantity_and_click_on_Buy_Now_Button() throws IOException {
		paymentGWHomepageObj = new PaymentGWHomepage();
		paymentGWHomepageObj.selectQuantity("3"); // Hard Code for Selecting Qunatity
		paymentProcessPageObj = paymentGWHomepageObj.clickBuyNowBtn();
	}

	@Then("user lands on payment gateway page and user clicks on generate Card Num link")
	public void user_lands_on_payment_gateway_page_and_user_clicks_on_generate_Card_Num_link() throws IOException {
		Assert.assertEquals("Guru99 Payment Gateway", driver.getTitle());
		cardNumPageObj = paymentGWHomepageObj.clickGenerateCardLink();

	}

	@Then("user copies card details")
	public void user_copies_card_details() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
		}
		cardNum = cardNumPageObj.getcardNum();
		System.out.println(cardNum);

		cvv = cardNumPageObj.getCvv();
		System.out.println(cvv);

		expMonth = cardNumPageObj.getExpMonth();
		System.out.println(expMonth);

		expYear = cardNumPageObj.getExpYear();
		System.out.println(expYear);

		driver.close();
		driver.switchTo().window(parentwindowHandle);
	}

	@Then("user enters the details payment page and clicks on pay button")
	public void user_enters_the_details_payment_page_and_clicks_on_pay_button() throws IOException {
		paymentSuccessPageObj = paymentProcessPageObj.fillCardDetails(cardNum, cvv, expMonth, expYear);

	}

	@Then("user notes Order Id and track it down")
	public void user_notes_Order_Id_and_track_it_down() {
		String orderId = paymentSuccessPageObj.getOrderId();
		System.out.println("Order ID = " + orderId);
	}

	@After
	public void closeBrowser() {
		TestBase.tearDown();
	}

}
