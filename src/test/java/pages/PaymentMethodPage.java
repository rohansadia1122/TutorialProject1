package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;

public class PaymentMethodPage extends BaseTest {

	public PaymentMethodPage(WebDriver ldriver) {
		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

}
