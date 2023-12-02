package assignment;

import java.time.Duration;
//Launch Amazon.in inspect email continue button
//password and sign in button using any locators
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment93 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement accountsAndList = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountsAndList).perform();
		Thread.sleep(3000);
		WebElement signIn = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[normalize-space()='Sign in']"));
		signIn.click();
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("holkarmahesh1@gmail.com");
		WebElement unContinue = driver.findElement(By.id("continue"));
		unContinue.click();
		WebElement pwd = driver.findElement(By.name("password"));

		pwd.sendKeys("3235@$@#fgd");
		WebElement pwdSubmit = driver.findElement(By.id("signInSubmit"));
		pwdSubmit.click();
	}
}
