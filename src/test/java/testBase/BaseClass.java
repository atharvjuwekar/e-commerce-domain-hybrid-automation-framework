package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	public Properties p;

	@BeforeClass(groups = {"Sanity","Regression","Master"})
	@Parameters({ "os", "browser" })
	public void setup(String osName, String browserName) throws IOException {

		FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
		p = new Properties();
		p.load(file);

		logger = LogManager.getLogger(this.getClass());

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid browser");
			return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(p.getProperty("baseUrl"));
		driver.manage().window().maximize();

	}

	@AfterClass(groups = {"Sanity","Regression","Master"})
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
