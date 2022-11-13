package maneesha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_001 {
	public static void main (String args []) {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		
	}

}
