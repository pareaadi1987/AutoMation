package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	//This will return webdriver object
	
	public static WebDriver open(String browserType) {
		if (browserType.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","/Users/aditya.pare/Desktop/Software/chromedriver");
	return new ChromeDriver();
	
	} 
		else {
			System.setProperty("webdriver.gecko.driver","//Users//Aditya.Pare//Desktop//geckodriver");
			return new FirefoxDriver();
			
		}
		
		}
	
}
  