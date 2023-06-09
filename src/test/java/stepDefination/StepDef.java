package stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class StepDef {

	MyAccountPage Acc;

	WebDriver driver;

	LoginPage lp;

	Logger logger;

	@Before
	public void setup() {

		// for logging
		logger = LogManager.getLogger(this.getClass());
	}

	@After
	public void teardown() {

	}

	@Given("User Launch browser")
	public void user_launch_browser() {
		driver = new ChromeDriver();
		logger.info("launched the browser");
	}

	@And("opens URL {string}")
	public void opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		logger.info("application is launched");
	}

	@When("User navigate to MyAccount menu")
	public void user_navigate_to_my_account_menu() {
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
	}

	@And("click on Login")
	public void click_on_login() {
		driver.findElement(By.linkText("Login")).click();
	}

	@And("User enters Email as {string} and Password as {string}")
	public void email_and_password(String email, String pwd) {

		lp.username(driver).sendKeys(email);
		lp.password(driver).sendKeys(pwd);
		// driver.findElement(By.name("email")).sendKeys(email);
		// driver.findElement(By.name("password")).sendKeys(pwd);
		logger.info("entered username and password");
	}

	@And("Click on Login button")
	public void click_on_login_button() {

		lp.loginbutton(driver).click();
		// driver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input")).click();
	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {

		Acc = new MyAccountPage(driver);
		boolean targetpage = Acc.isMyAccountPageExists();

		if (targetpage) {

			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);

		}
		driver.close();
	}

}
