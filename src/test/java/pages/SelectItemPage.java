package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;

public class SelectItemPage extends BaseTest {

	public SelectItemPage(WebDriver ldriver) {

		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	public ViewCartPage addToCart() throws InterruptedException {

		WebElement addCartClick = dr.findElement(By.xpath("//*[@id=\"button-cart\"]"));
		addCartClick.click();

		Thread.sleep(2000);

		WebElement CartClick = dr.findElement(By.xpath("//*[@id=\"cart-total\"]"));
		CartClick.click();
		Thread.sleep(2000);

		WebElement viewCartClick = dr.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"));
		viewCartClick.click();
		Thread.sleep(2000);

		return new ViewCartPage(dr);

	}

}
