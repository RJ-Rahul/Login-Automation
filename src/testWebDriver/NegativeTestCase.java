package testWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NegativeTestCase {
	public static void negativeCase(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webmail.bayamp.com/");
		WebElement element=driver.findElement(By.id("user"));
		element.sendKeys("user1@bayamp.com");
		element=driver.findElement(By.id("pass"));
		element.sendKeys("user2");
		element=driver.findElement(By.id("login_submit"));
		element.click();
		element=driver.findElement(By.id("notify"));
		System.out.println(element.getText());
	}
}
