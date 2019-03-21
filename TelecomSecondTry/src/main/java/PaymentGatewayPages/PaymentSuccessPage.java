package PaymentGatewayPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class PaymentSuccessPage extends TestBase{

	@FindBy(xpath = "(//table[@class='alt access']//h3)[2]")
	WebElement orderId;
	
	@FindBy(xpath = "//ul[@class='actions']//a")
	WebElement homeBtn;
	
	public PaymentSuccessPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String getOrderId() {
		return orderId.getText();
	}

}
