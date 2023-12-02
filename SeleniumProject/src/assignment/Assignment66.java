package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
Amazon log in*/
class Assignment66 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement accountsAndList = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountsAndList).perform();
		WebElement signIn = driver.findElement(By.xpath("//span[.='Sign in']"));
		signIn.click();
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("holkarmahesh1@gmail.com");
		WebElement unContinue = driver.findElement(By.id("continue"));
		unContinue.click();
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("3235@$@#fgd");
		WebElement pwdSubmit = driver.findElement(By.id("signInSubmit"));
		pwdSubmit.click();
//		driver.close();
	}
}
