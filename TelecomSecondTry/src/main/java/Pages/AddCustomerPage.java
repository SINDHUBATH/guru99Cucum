package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class AddCustomerPage extends TestBase{

	@FindBy(xpath = "//label[@for='done']")
	WebElement bgChkDone;

	@FindBy(xpath = "//label[@for='pending']")
	WebElement bgChkPending;

	@FindBy(id = "fname")
	WebElement billingAddressFirstName;

	@FindBy(id = "lname")
	WebElement billingAddressLastName;

	@FindBy(css = "#email")
	WebElement billingAddressEmail;

	@FindBy(xpath = "//textarea[@id='message']")
	WebElement billingAddress;

	@FindBy(id = "telephoneno")
	WebElement mobileNum;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement resetBtn;

	public AddCustomerPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public AccessDetailsPage fillCustomerDetails(String firstName, String lastName, String mail, String address,String phNum) throws IOException {
		bgChkDone.click();
		billingAddressFirstName.sendKeys(firstName);
		billingAddressLastName.sendKeys(lastName);
		billingAddressEmail.sendKeys(mail);
		billingAddress.sendKeys(address);
		mobileNum.sendKeys(phNum);
		submitBtn.click();
		return new AccessDetailsPage();
	}
	
}
