package firstPackageforSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement closeLogin = driver.findElement(By.xpath("//span[@role='button']"));
		closeLogin.click();
		Thread.sleep(2000);
		WebElement searchTextBox =driver.findElement(By.xpath("//input[@name='q']"));
		searchTextBox.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));

		autosuggestion.get(1).click();

	}

}
