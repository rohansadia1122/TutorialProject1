package testCases;

import org.testng.annotations.Test;

import baseClass.BaseTest;
import pages.BillingDetailsPage;
import pages.GuestCheckOutPage;
import pages.HomePage;
import pages.PaymentMethodPage;
import pages.SelectItemPage;
import pages.ViewCartPage;

public class BIllingDetailesTest extends BaseTest {

	static HomePage hp;
	static SelectItemPage sip;
	static ViewCartPage vcp;
	static GuestCheckOutPage gcop;
	static BillingDetailsPage bdp;
	static PaymentMethodPage pmp;

	@Test
	
	public void billing() throws InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setup();

		hp = new HomePage(dr);
		Thread.sleep(2000);
		sip = hp.itemSelect();
		Thread.sleep(2000);
		vcp = sip.addToCart();
		Thread.sleep(2000);
		gcop = vcp.checkOutClick();
		Thread.sleep(2000);
		bdp = gcop.GuestClick();
		Thread.sleep(2000);
		bdp.addres(config.getFname(), config.getLname(), config.getEmail(), config.getPhone(), config.getCompany(),
				config.getAddress(), config.getCity(), config.getPostCode());

		Thread.sleep(2000);
		bt.tearDown();
		
	}

}
