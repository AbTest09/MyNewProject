package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

	static WebElement ele = null;
	
	public static WebElement Accountclick (WebDriver driver) {
		return ele = driver.findElement(By.linkText("My Account"));
	}
	
	public static WebElement logout (WebDriver driver) {
		return ele = driver.findElement(By.linkText("Logout"));
			
		
	}
	
}
