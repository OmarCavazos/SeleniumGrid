package GoogleTest;

import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//URI, URL
		
		caps.setBrowserName("chrome");
//		caps.setPlatform(Platform.);
//		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "edge");

		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.100.7:4444").toURL(), caps );
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Omar Cavazos");
		driver.close();
		
	}

}
