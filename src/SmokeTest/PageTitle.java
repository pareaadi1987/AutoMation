package SmokeTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class PageTitle {
	@Test
	public void pageTitle() {
	
		String webUrl ="http://dev-de-util-sandbox-akqa-stage.pub.dglecom.net";
		
		WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.get(webUrl);
		String actualtitle = driver.getTitle();
		String expectedtitle = "Douglas Beauty Booking";
		System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	//Assert.fail("fsdfsdf");
	}
	
	}
	


