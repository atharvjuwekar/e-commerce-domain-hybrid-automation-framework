package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtLoginEmail;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtLoginPassword;
	@FindBy(xpath="//input[@value='Login']") WebElement btnLogin;
	
	
	public void setLoginEmail(String value) {
		txtLoginEmail.sendKeys(value);
	}
	
	public void setLoginPassword(String value) {
		txtLoginPassword.sendKeys(value);
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
	}
}
