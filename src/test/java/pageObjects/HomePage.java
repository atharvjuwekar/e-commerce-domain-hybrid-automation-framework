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
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement btnLogin;
	@FindBy(xpath = "//input[@placeholder='Search']") // For Search Product Test
	WebElement txtSearchbox;
	@FindBy(xpath = "//div[@id='search']//button[@type='button']") // For Search Product Test
	WebElement btnSearch;

	// Actions

	public void clickMyAccount() {
		btnMyAccount.click();
	}

	public void clickRegister() {
		btnRegister.click();
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void enterProductName(String pName) // For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}

	public void clickSearch() // For Search Product Test
	{
		btnSearch.click();
	}

}