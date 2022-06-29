package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement LoginBtn;

	@FindBy(id = "welcome")
	WebElement LinkToLogout;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;

	public void enterUsername(String user) {
		userName.clear();
		userName.sendKeys(user);
	}

	public void enterPassword(String pswd) {
		password.clear();
		password.sendKeys(pswd);
	}

	public void clickLogin() {
		LoginBtn.click();
	}

	public void LinkToLogout() {
		LinkToLogout.click();
	}

	public void clickLogout() {
		Logout.click();
	}

}
