package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseTest;

public class BillingDetailsPage extends BaseTest {

	public BillingDetailsPage(WebDriver ldriver) {
		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	public PaymentMethodPage addres(String fname, String lname, String Email, String phone, String company,
			String address, String city, String postcode) throws InterruptedException {

		WebElement fName = dr.findElement(By.name("firstname"));
		fName.sendKeys(fname);

		WebElement lName = dr.findElement(By.name("lastname"));
		lName.sendKeys(lname);

		Thread.sleep(1000);

		WebElement eMail = dr.findElement(By.xpath("//*[@id=\"input-payment-email\"]"));
		eMail.sendKeys(Email);

		Thread.sleep(1000);

		WebElement pHone = dr.findElement(By.name("telephone"));
		pHone.sendKeys(phone);

		Thread.sleep(1000);

		WebElement cOmpany = dr.findElement(By.name("company"));
		cOmpany.sendKeys(company);

		Thread.sleep(1000);

		WebElement aDdress = dr.findElement(By.name("address_1"));
		aDdress.sendKeys(address);

		Thread.sleep(1000);

		WebElement cIty = dr.findElement(By.xpath("//*[@id=\"input-payment-city\"]"));
		cIty.sendKeys(city);

		Thread.sleep(1000);

		WebElement postCode = dr.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]"));
		postCode.sendKeys(postcode);

		Thread.sleep(1000);

		WebElement cOuntry = dr.findElement(By.xpath("//*[@id=\"input-payment-country\"]/option[240]"));
		cOuntry.click();

		Thread.sleep(2000);

		WebElement sTate = dr.findElement(By.xpath("//*[@id=\"input-payment-zone\"]/option[44]"));
		sTate.click();

		WebElement continueBtn = dr.findElement(By.xpath("//*[@id=\"button-guest\"]"));
		continueBtn.click();

		return new PaymentMethodPage(dr);

	}

}
