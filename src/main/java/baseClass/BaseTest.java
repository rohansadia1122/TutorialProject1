package baseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver dr;

	public static ReadConfig config = new ReadConfig();

	public void setup() {

		dr = new ChromeDriver();
		dr.get(config.getURL());
		
	

	}

	public void tearDown() {
		dr.close();
		
	}
	
}
