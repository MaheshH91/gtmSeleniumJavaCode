package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch facebook and type your email in email text area using tag name*/
class Assignment68 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> emailInput = driver.findElements(By.tagName("input"));
		emailInput.get(2).sendKeys("holkarmahesh@ymail.com");
//		driver.close();
	}
}
