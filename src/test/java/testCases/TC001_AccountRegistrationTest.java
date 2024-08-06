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

	@Test
	public void verifyAccountRegistration() {

		logger.info("************************ Staring TC001_AccountRegistrationTest ************************12");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();

			AccountRegistrationPage arp = new AccountRegistrationPage(driver);

			arp.setFirstName(randomAlphabeticString(5).toUpperCase());
			arp.setLastName(randomAlphabeticString(5).toUpperCase());
			arp.setEmail(randomAlphabeticString(5) + "@gmail.com");
			arp.setTelephone(randomNumericString(10));

			String pwd = randomAlphaNumericString(8);

			arp.setPassword(pwd);
			arp.setConfirmPassword(pwd);
			arp.setPrivacyPolicy();
			arp.clickContinue();

			logger.info("Validating expected confirm message");

			String confirmMsg = arp.getConfirmationMsg();
			if (confirmMsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			} else {
				logger.error("Test Failed..");
				logger.debug("Desbug logs..");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("************************ finished TC001_AccountRegistrationTest **********************");

	}

}
