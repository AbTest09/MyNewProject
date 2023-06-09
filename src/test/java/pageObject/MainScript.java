package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScript {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Login
		
		LoginPage.username(driver).sendKeys("test.ab@gmail.com");
		LoginPage.password(driver).sendKeys("demo@1234");
		LoginPage.loginbutton(driver).click();
		
		//Logout
		LogoutPage.Accountclick(driver).click();
		LogoutPage.logout(driver).click();
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
