package Util;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class TestUtilities extends TestBase{

	public TestUtilities() throws IOException {
		super();
	}

	public static void selectDropDownbyVisibleText(WebElement ele, String visibleText) {
		Select slt = new Select(ele);
		slt.selectByVisibleText(visibleText);
	}

}
