package assignment;

import java.time.Duration;

//Login to amazon using relative xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment73 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement accountsAndList = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountsAndList).perform();
		WebElement signIn = driver.findElement(By.xpath("//span[.='Sign in']"));
		signIn.click();
		WebElement un = driver.findElement(By.xpath("//input[@id='ap_email']"));
		un.sendKeys("holkarmahesh1@gmail.com");
		WebElement unContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		unContinue.click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id='ap_password']"));

		pwd.sendKeys("3235@$@#fgd");
		WebElement SignInBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		SignInBtn.click();

	}
}
