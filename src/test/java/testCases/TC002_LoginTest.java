package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test
	void verifyLogin() {
		logger.info("******************Starting TC002_LoginTest********************");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setLoginEmail(p.getProperty("email"));
		lp.setLoginPassword(p.getProperty("password"));
		lp.clickLoginBtn();
		
		AccountPage ap = new AccountPage(driver);
		
		Assert.assertTrue(ap.validateMyAccountHeading());
		}
		catch(Exception e) {
			Assert.assertTrue(false);
		}
		
		logger.info("******************finishing TC002_LoginTest********************");
	}
}
