package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@When("User enters Username as {string}  and Password as {string2}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		lp.enterUsername(string);
		lp.enterPassword(string2);

	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Invalid credentials")) {
			driver.close();
			assertTrue(false);
		} else {
			assertEquals(title, driver.getTitle());

		}
	}

	@When("User click on LogOut Link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.LinkToLogout();
		Thread.sleep(1000);
		lp.clickLogout();
		Thread.sleep(3000);

	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be1(String string) {
		driver.getTitle();

	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
