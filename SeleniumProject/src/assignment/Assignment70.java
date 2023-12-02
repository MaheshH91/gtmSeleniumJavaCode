package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch google and type country name using absolute xpath locator*/
class Assignment70 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement searchBoxField = driver
.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div/div/div/textarea"));
		searchBoxField.sendKeys("India");
		searchBoxField.submit();

//		driver.close();
	}
}
