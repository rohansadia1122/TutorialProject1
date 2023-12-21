package testCases;

import baseClass.BaseTest;
import io.netty.channel.DefaultChannelPipeline;
import pages.BillingDetailsPage;

import pages.GuestCheckOutPage;
import pages.HomePage;
import pages.SelectItemPage;
import pages.ViewCartPage;

public class GuestCheckOutTest extends BaseTest {

	static HomePage hp;
	static SelectItemPage sip;
	static ViewCartPage vcp;
	static GuestCheckOutPage gcop;
	static BillingDetailsPage bdp;

	public static void main(String[] args) throws InterruptedException {
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

	}

}
