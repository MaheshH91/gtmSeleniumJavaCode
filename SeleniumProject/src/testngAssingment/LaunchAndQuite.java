package testngAssingment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuite {
	WebDriver driver;

	@BeforeMethod
	public void launch() throws InterruptedException {

		driver = new ChromeDriver(); // local varialble
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
//		WebElement accountsAndList = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
//		Actions a1 = new Actions(driver);
//		a1.moveToElement(accountsAndList).perform();
		
		Thread.sleep(2000);
		
	}

	@AfterMethod
	public void quite() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();
	}

}
