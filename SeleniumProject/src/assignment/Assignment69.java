package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch google and type country name using class name locator*/
class Assignment69 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement searchBoxField = driver.findElement(By.className("gLFyf"));
		
		searchBoxField.sendKeys("India");
		searchBoxField.submit();

	
//		driver.close();
	}
}
