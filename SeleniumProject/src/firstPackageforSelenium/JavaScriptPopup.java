package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("file:///C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\learningHTML1.html");

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("Mahesh");
		Thread.sleep(300);

	}

}
