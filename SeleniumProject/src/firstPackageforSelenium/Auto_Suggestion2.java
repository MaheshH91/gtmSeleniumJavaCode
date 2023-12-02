package firstPackageforSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		searchText.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));

		autosuggestion.get(1).click();

	}

}
