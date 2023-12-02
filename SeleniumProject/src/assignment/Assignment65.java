package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Log in to Facebook using Automation

class Assignment65 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("Mahesh@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Mfgdf@876456$");
		driver.findElement(By.name("login")).click();

//		driver.close();
	}
}
