package assignment;

//Get on to Amazon.in Type shoes Find out total number of  autosuggestions
// And
//select shoes for men using 3 generations x path
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment79 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("Shoes");
		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//div/div[@class='s-suggestion-container']/div"));

		autosuggestion.get(0).click();
	}
}
