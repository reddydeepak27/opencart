package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement lnkMyAccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;

	@FindBy(linkText = "Login") // Login link added in step6
	WebElement linkLogin;

	public void clickMyAccount() {
		lnkMyAccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}

	public void clickLogin() // added in step6
	{
		linkLogin.click();
	}

}
