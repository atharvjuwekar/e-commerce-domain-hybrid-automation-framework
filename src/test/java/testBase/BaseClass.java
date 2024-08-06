package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	
	@BeforeClass
	public void setup() {
		
		logger = LogManager.getLogger(this.getClass());		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	public String randomAlphabeticString(int size) {
		return RandomStringUtils.randomAlphabetic(size);
	
	}
	
	public String randomAlphaNumericString(int size) {
		return RandomStringUtils.randomAlphanumeric(size);
	
	}
	
	public String randomNumericString(int size) {
		return RandomStringUtils.randomNumeric(size);
	
	}

}
