package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch maximized google browser,type India & put enter in the code*/
class Assignment63 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement textBoxField = driver.findElement(By.name("q"));
		textBoxField.sendKeys("India");
		textBoxField.sendKeys(Keys.ENTER);
//		driver.close();
	}
}
