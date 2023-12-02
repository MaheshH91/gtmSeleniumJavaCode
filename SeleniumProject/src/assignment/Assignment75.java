package assignment;

import java.time.Duration;

//Login to amazon using relative xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch flipkart and click onto the cross button
public class Assignment75 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement closeBtn = driver.findElement(By.xpath("//span[@role='button']"));
		Thread.sleep(3000);
		closeBtn.click();
	}
}
