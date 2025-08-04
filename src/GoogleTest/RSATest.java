package GoogleTest;

import java.net.URI;
import java.security.DrbgParameters.Capability;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {
	
	@Test
	public void HomePageCheck() throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
				
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.100.7:4444").toURL(), caps );
		
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());		
		driver.close();
		
	}

}
