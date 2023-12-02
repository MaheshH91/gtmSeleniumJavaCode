package assignment;

//Goto Amazon hover over in Accounts and Lists using xpath by text and 
//Find multiple options  and do log in
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment84 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement AccAndList = 
				driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		Actions ac = new Actions(driver);

		ac.moveToElement(AccAndList).build().perform();
		WebElement signIn = driver.findElement(By.xpath("//span[.='Sign in']"));
		signIn.click();
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("holkarmahesh1@gmail.com");
		WebElement unContinue = driver.findElement(By.id("continue"));
		unContinue.click();
		WebElement pwd = driver.findElement(By.name("password"));

		pwd.sendKeys("3235@$@#fgd");
		WebElement pwdSubmit = driver.findElement(By.xpath("//span[contains(.,'Sign in')]"));
		pwdSubmit.click();

	}
}
