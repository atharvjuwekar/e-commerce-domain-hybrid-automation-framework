package testCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.ExcelUtility;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups = { "Regression", "Master" })
	public void verifyAccountRegistration() throws IOException {

		logger.info("************************ Staring TC001_AccountRegistrationTest ************************#");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();

			AccountRegistrationPage arp = new AccountRegistrationPage(driver);

			arp.setFirstName(randomAlphabeticString(5).toUpperCase());
			arp.setLastName(randomAlphabeticString(5).toUpperCase());
			String email = randomAlphabeticString(5) + "@gmail.com";
			arp.setEmail(email);
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

				String path = ".\\testData\\Opencart_LoginData.xlsx";// taking xl file from testData
				ExcelUtility xlutil = new ExcelUtility(path);// creating an object for XLUtility
				xlutil.writeTestData("Sheet1", email, pwd);

			} else {
				logger.error("Test Failed..");
				logger.debug("Desbug logs..");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {

			Assert.fail();
		}

		AccountPage ap = new AccountPage(driver);
		ap.clickLogout();

		logger.info("************************ finished TC001_AccountRegistrationTest **********************");

	}

}
