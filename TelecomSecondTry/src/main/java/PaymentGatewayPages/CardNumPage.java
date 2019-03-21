package PaymentGatewayPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CardNumPage extends TestBase {

	@FindBy(xpath = "//div[@class='inner']//descendant::h4[contains(text(),'Card Number')]")
	WebElement cardNumEle;

	@FindBy(xpath = "//div[@class='inner']//descendant::h4[contains(text(),'CVV')]")
	WebElement cvvNumEle;

	@FindBy(xpath = "//div[@class='inner']//descendant::h4[contains(text(),'Exp')]")
	WebElement expMonthAndYearEle;

	@FindBy(xpath = "//div[@class='inner']//descendant::h4[contains(text(),'Credit Limit ')]//span")
	WebElement creditLimit;

	public CardNumPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public String getcardNum() {
		String cardNumLine = cardNumEle.getText();
		String[] cardNumArray = cardNumLine.split(":-");
		String cardNum = cardNumArray[1].trim();
		return cardNum;
	}

	public String getCvv() {
		String cvvLine = cvvNumEle.getText();
		String[] cvvLineArray = cvvLine.split(":-");
		String cvvNum = cvvLineArray[1].trim();
		return cvvNum;
	}

	public String getExpMonth() {
		String expMonthAndYearLine = expMonthAndYearEle.getText();
		String[] expMonthAndYearArray = expMonthAndYearLine.split(":-");
		String expMonth = (expMonthAndYearArray[1].split("/"))[0].trim();
		return expMonth;
	}

	public String getExpYear() {
		String expMonthAndYearLine = expMonthAndYearEle.getText();
		String[] expMonthAndYearArray = expMonthAndYearLine.split(":-");
		String expYear = (expMonthAndYearArray[1].split("/"))[1].trim();
		return expYear;
	}

}
