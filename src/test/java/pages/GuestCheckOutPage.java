package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;

public class GuestCheckOutPage extends BaseTest {

	public GuestCheckOutPage(WebDriver ldriver) {

		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	public BillingDetailsPage GuestClick() throws InterruptedException {
		WebElement guestClick = dr.findElement(By.xpath("(//*[@name = 'account'])[2]"));
		guestClick.click();

		Thread.sleep(3000);

		WebElement guestContinue = dr.findElement(By.xpath("//*[@id=\"button-account\"]"));
		guestContinue.click();

		return new BillingDetailsPage(dr);

	}
}
