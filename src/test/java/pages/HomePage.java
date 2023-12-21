package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;

public class HomePage extends BaseTest {

	public HomePage(WebDriver ldriver) {

		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	public SelectItemPage itemSelect() throws InterruptedException {

		WebElement selectItem = dr.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a"));
		Thread.sleep(2000);

		selectItem.click();
		return new SelectItemPage(dr);

	}

}
