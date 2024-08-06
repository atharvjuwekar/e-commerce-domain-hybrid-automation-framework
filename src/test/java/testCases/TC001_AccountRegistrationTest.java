package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyAccountRegistration() {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage arp = new AccountRegistrationPage(driver);
		
		arp.setFirstName(randomAlphabeticString(5).toUpperCase());
		arp.setLastName(randomAlphabeticString(5).toUpperCase());
		arp.setEmail(randomAlphabeticString(5)+"@gmail.com");
		arp.setTelephone(randomNumericString(10));
		
		String pwd = randomAlphaNumericString(8);
		
		arp.setPassword(pwd);
		arp.setConfirmPassword(pwd);
		arp.setPrivacyPolicy();
		arp.clickContinue();
		
		String confirmMsg = arp.getConfirmationMsg();
		
		Assert.assertEquals(confirmMsg, "Your Account Has Been Created!");
		
	}
	
	
}
