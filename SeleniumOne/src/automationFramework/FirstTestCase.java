package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {

	public static void main(String[] args) {
		
//		setSystemProps();
		
//		WebDriver driver = initializeFireFox(initiateDesiredCapabilites());
		
//		WebDriver driver = initializeFireFox();
		
		WebDriver driver = initializeChrome();
		
		driver.get("http://www.store.demoqa.com");
		
		System.out.println("Success");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
//		driver.close();
		
	}

	private static WebDriver initializeChrome() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	private static void setSystemProps() {
		System.setProperty("webdriver.gecko.driver","/home/ultimate/Documents/Software/SeleniumJars/geckodriver");
	}

	private static WebDriver initializeFireFox(DesiredCapabilities capabilities) {
		WebDriver driver = new FirefoxDriver(capabilities);
		return driver;
	}

	private static void initiateDesiredCapabilites() {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
	}

	private static WebDriver initializeFireFox() {
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
}
