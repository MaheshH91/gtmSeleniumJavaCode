package assignment;

// Launch Amazon .in Type shoes select 1st shoe and close the child

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment92 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		searchText.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//div/div[@class='s-suggestion-container']/div"));

		autosuggestion.get(0).click();

		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));

		products.get(0).click();

		Set<String> parentChildHandle = driver.getWindowHandles();

		Iterator<String> itr = parentChildHandle.iterator();
		String id1 = itr.next();
		String id2 = itr.next();

		driver.switchTo().window(id2);

		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(id1);
		
	}
}
