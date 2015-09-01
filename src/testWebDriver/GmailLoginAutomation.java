package testWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLoginAutomation {
	public static void main(String[] args) throws InterruptedException {
		PositiveTestCase.positiveCase();
		Thread.sleep(30);
		NegativeTestCase.negativeCase();
	}
}


