package assignment;

//Use implicitlyWait to observe the runtime  of  your   code that contains 
//findElement and findElements for Amazon
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment98 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("Shoes");

		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//div/div[@class='s-suggestion-container']/div"));
		autosuggestion.get(0).click(); // Without implicitly wait it gives java.lang.IndexOutOfBoundsException
										// Exception

		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		products.get(0).click();
	}
}
