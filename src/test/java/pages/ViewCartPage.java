package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;

public class ViewCartPage extends BaseTest {

	public ViewCartPage(WebDriver ldriver) {

		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	public GuestCheckOutPage checkOutClick() {

		WebElement checkOut = dr.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
		checkOut.click();
		return new GuestCheckOutPage(dr);

	}

}
