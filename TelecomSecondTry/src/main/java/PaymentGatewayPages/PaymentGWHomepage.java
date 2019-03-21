package PaymentGatewayPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Util.TestUtilities;

public class PaymentGWHomepage extends TestBase {

	@FindBy(xpath = "//select[@name='quantity']")
	WebElement quantityDropDown;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement buyNowBtn;

	@FindBy(xpath = "//nav[@id='nav']//a[text()='Generate Card Number']")
	WebElement generateCardNumLink;

	public PaymentGWHomepage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void selectQuantity(String quantity) {
		TestUtilities.selectDropDownbyVisibleText(quantityDropDown, quantity);
//		Select slt = new Select(quantityDropDown);
//		slt.selectByVisibleText(quantity);
	}

	public PaymentProcessPage clickBuyNowBtn() throws IOException {
		buyNowBtn.click();
		return new PaymentProcessPage();
	}

	public CardNumPage clickGenerateCardLink() throws IOException {
		generateCardNumLink.click();
		return new CardNumPage();
	}

}
