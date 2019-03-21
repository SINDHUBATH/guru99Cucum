package PaymentGatewayPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Util.TestUtilities;

public class PaymentProcessPage extends TestBase {

	@FindBy(id = "card_nmuber")
	WebElement cardNumberField;

	@FindBy(id = "cvv_code")
	WebElement cvvField;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement payBtn;

	@FindBy(xpath = "//select[@id='month']")
	WebElement monthDropDown;

	@FindBy(xpath = "//select[@id='year']")
	WebElement yearDropDown;

	public PaymentProcessPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public PaymentSuccessPage fillCardDetails(String cardNumber, String cvvNumber, String validaityMonth, String validaityYear)
			throws IOException {
		cardNumberField.sendKeys(cardNumber);
		cvvField.sendKeys(cvvNumber);
		TestUtilities.selectDropDownbyVisibleText(monthDropDown, validaityMonth);
		TestUtilities.selectDropDownbyVisibleText(yearDropDown, validaityYear);
		payBtn.click();
		return new PaymentSuccessPage();
	}

}
