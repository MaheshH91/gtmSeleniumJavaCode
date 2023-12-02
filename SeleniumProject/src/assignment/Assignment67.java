package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
Launch google and click on Gmail using Link Text operator*/
class Assignment67 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		gmailLink.click();
//		driver.close();
	}
}
