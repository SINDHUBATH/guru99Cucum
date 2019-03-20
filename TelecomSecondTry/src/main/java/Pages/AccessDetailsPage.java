package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class AccessDetailsPage extends TestBase {

	@FindBy(xpath = "//table[@class='alt access']//h3")
	WebElement customerId;

	@FindBy(xpath = "//a[@class='button']")
	WebElement homeBtn;

	public AccessDetailsPage() throws IOException{
		PageFactory.initElements(driver, this);
	}

	public String getCustomerId() {
		return customerId.getText();

	}

}
