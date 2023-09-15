package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LogInPageShubham extends BasePage {

	public LogInPageShubham(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;

	public void setPassword() {
		txtPassword.sendKeys("mow&cd-2752407");
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void setuser() {
		txtusername.sendKeys("mow&cd-2752407");
	}

	@FindBy(xpath = "//select[@name='SelectTheme']")
	WebElement theme;
	@FindBy(xpath = "//select[@name='SelectLevel']")
	WebElement level;
	@FindBy(xpath = "//select[@name='awc_center']")
	WebElement awc;
	@FindBy(xpath = "//select[@name='SelectActivity']")
	WebElement activity;
	@FindBy(xpath = "//input[@name='SelectDateFrom']")
	WebElement date1;
	@FindBy(xpath = "//input[@name='SelectDateTo']")
	WebElement date2;
	@FindBy(xpath = "//input[@name='CountAdultMale']")
	WebElement adultMale;
	@FindBy(xpath = "//input[@name='CountAdultFemale']")
	WebElement adultFemale;
	@FindBy(xpath = "//input[@name='CountChildMale']")
	WebElement childMale;
	@FindBy(xpath = "//input[@name='CountChildFemale']")
	WebElement childFemale;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement btnsubmit;

	public void fillform() 
	{

		Select selectTheme = new Select(theme);

		List<WebElement> options = selectTheme.getOptions();

		for (int i = 1; i < options.size(); i++) 
		{
			options.get(i).click();
		

		Select sltlevel = new Select(level);
		sltlevel.selectByIndex(2);

		Select selectAWC = new Select(awc);
		selectAWC.selectByVisibleText("Harangul Bk8 Awc");

		Select selectActivity = new Select(activity);

		List<WebElement> options1 = selectActivity.getOptions();

		   for (int p = 1; p < options1.size(); p++) 
		   {
			  options1.get(p).click();
		   }
	    
		
		// select from date
		// select to date

		// male female numbers code
		// click on submit
		}
	}

}
