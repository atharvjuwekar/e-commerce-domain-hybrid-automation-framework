package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement myAccountHeading;

	public boolean validateMyAccountHeading() {
		try {
			return myAccountHeading.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
