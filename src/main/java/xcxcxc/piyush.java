package xcxcxc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class piyush {
	WebDriver driver;
	@Test
	
	public void yahoologin() {
		System.setProperty("webdriver.chorme.driver", "C:/Users/remoteadmin/Desktop/BrowserDrivers");
		driver=new ChromeDriver();
		driver.get("www.google.com");
		
		
	}
	
}


