package testCases;

import baseClass.BaseTest;
import pages.HomePage;
import pages.SelectItemPage;
import pages.ViewCartPage;

public class SelectItemTest extends BaseTest{

	static HomePage hp;
	static SelectItemPage sip;
	static ViewCartPage vcp;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setup();
		
		hp = new HomePage(dr);
		sip=hp.itemSelect();
		vcp= sip.addToCart();
		
	}

}
