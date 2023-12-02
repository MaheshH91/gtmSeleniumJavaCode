package firstPackageforSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");

		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> autoSuggetions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

		int countOfAutoSuggetion = autoSuggetions.size();
		System.out.println(countOfAutoSuggetion);
		Thread.sleep(3000);
		autoSuggetions.get(countOfAutoSuggetion-1).click();
		Thread.sleep(3000);
//		autoSuggetions.get(countOfAutoSuggetion-4).click();
//		autoSuggetions.get(5).click();

	}

}
