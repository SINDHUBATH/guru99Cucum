package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{

		
		@FindBy(xpath = "//section[@id='one']//a[text()='Add Customer']")
		WebElement addCustomer;
		
		@FindBy(xpath = "//a[text()='Add Tariff Plan']")
		WebElement addTariffPlan;
		
		@FindBy(xpath = "//section[@id='one']//a[text()='Add Tariff Plan to Customer']")
		WebElement addTariffPlanToCustomer;

		@FindBy(xpath = "//section[@id='one']//a[text()='Pay Billing']")
		WebElement payBilling;
		
		public HomePage() throws IOException{
			PageFactory.initElements(driver, this);
		}

		public AddCustomerPage clickonAddCustomerLink() throws IOException {
			addCustomer.click();
			return new AddCustomerPage();
		}
		
		
	}



