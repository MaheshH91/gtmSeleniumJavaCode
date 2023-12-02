package assignment;

//Launch Amazon use link text and partial link text for best sellers
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment95 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Best Sellers")).click(); // linkText

		driver.findElement(By.partialLinkText("Best")).click(); // partial LinkText

	}
}
