package assignment;

//Use xpath for FB login page to login
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment94 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement emailEle = driver.findElement(By.xpath("//*[@id='email']"));
		emailEle.sendKeys("maheshholkar@fb231.com");
		WebElement passwordEle = driver.findElement(By.xpath("//input[@id='pass']"));
		passwordEle.sendKeys("maheshholkar@241243");

		WebElement loginBtnEle = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtnEle.click();
	}
}
