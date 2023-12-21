package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputFilter.Config;
import java.util.Properties;

public class ReadConfig extends BaseTest {

	FileInputStream inputFile;
	Properties prop = new Properties();

	public ReadConfig() {

		try {
			inputFile = new FileInputStream(new File(
					"C:\\Users\\Mohammad\\eclipse-workspace\\TutorialProject\\src\\test\\resources\\Resources\\ReadConfig.properties"));
			prop.load(inputFile);

		} catch (Exception e) {

		}
	}

	public String getURL() {

		String myURL = prop.getProperty("url");
		return myURL;

	}

	public String getFname() {

		String fName = prop.getProperty("firstname");
		return fName;

	}

	public String getLname() {
		String lName = prop.getProperty("lastname");
		return lName;

	}

	public String getEmail() {
		String lName = prop.getProperty("email");
		return lName;

	}

	public String getPhone() {
		String ph = prop.getProperty("phone");
		return ph;

	}

	public String getCompany() {
		String com = prop.getProperty("company");
		return com;

	}

	public String getAddress() {
		String add = prop.getProperty("address");
		return add;

	}

	public String getCity() {
		String ct = prop.getProperty("city");
		return ct;

	}

	public String getPostCode() {
		String code = prop.getProperty("postcode");
		return code;

	}

}
