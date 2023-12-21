package testCases;

import baseClass.BaseTest;
import pages.GuestCheckOutPage;
import pages.HomePage;
import pages.SelectItemPage;
import pages.ViewCartPage;

public class ViewCartTest extends BaseTest {

	static HomePage hp;
	static SelectItemPage sip;
	static ViewCartPage vcp;
	static GuestCheckOutPage gcop;

	public static void main(String[] args) throws InterruptedException {

		hp = new HomePage(dr);
		sip = hp.itemSelect();
		gcop = vcp.checkOutClick();

	}

}
