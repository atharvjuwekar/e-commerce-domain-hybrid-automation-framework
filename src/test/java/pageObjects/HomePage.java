package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// LOcators

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement btnMyAccount;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement btnRegister;

	// Actions

	public void clickMyAccount() {
		btnMyAccount.click();
	}

	public void clickRegister() {
		btnRegister.click();
	}
}