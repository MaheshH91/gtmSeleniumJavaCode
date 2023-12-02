package assignment;

////Go to Amazon
//Mobiles link
//And double click to navigate to the new page 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment82 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		WebElement MobileLink = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		Actions act = new Actions(driver);

		act.doubleClick(MobileLink).build().perform();
	}
}
