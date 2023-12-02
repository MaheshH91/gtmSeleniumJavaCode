package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("facebook.com");
		WebElement emailEle = driver.findElement(By.xpath("//*[@id='email']"));
		emailEle.sendKeys("maheshholkar@fb231.com");
		WebElement passwordEle = driver.findElement(By.xpath("//input[@id='pass']"));
		passwordEle.sendKeys("maheshholkar@241243");

		WebElement loginBtnEle = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtnEle.click();
	}
}
