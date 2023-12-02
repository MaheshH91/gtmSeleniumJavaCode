package assignment;

//Launch Amazon.in 
//Select books from drop down
//Type humans
//Press Enter key
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment77 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		Select s1 = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
		s1.selectByVisibleText("Books");

		WebElement searchBox = 
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("human" + Keys.ENTER);
	}
}
