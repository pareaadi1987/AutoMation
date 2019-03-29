package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	
	public static void main(String[] args) {
		String browserType="chrome";
		WebDriver driver;
		driver =utilities.DriverFactory.open(browserType);
		driver.get("https://booking.douglas.de");
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.js-focus-visible:nth-child(2) div.jsx-2065367278.container:nth-child(1) nav.jsx-3418461620.header.transitions-fade:nth-child(2) div.jsx-3418461620.profileMenuButton:nth-child(3) div.jsx-658992741.navButton > span.jsx-658992741:nth-child(2)")));

		driver.findElement(By.cssSelector("body.js-focus-visible:nth-child(2) div.jsx-2065367278.container:nth-child(1) nav.jsx-3418461620.header.transitions-fade:nth-child(2) div.jsx-3418461620.profileMenuButton:nth-child(3) div.jsx-658992741.navButton > span.jsx-658992741:nth-child(2)")).click();;
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.js-focus-visible:nth-child(2) div:nth-child(2) > div:nth-child(1)")));
		driver.findElement(By.cssSelector("body.js-focus-visible:nth-child(2) div:nth-child(2) > div:nth-child(1)")).click();
		
		
	}

}
