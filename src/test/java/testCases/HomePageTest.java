package testCases;

import baseClass.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest {

	static HomePage hp;
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Thread.sleep(3000);
		hp= new HomePage(dr);
		hp.itemSelect();
		
		
	
		
		
		
	}

}
