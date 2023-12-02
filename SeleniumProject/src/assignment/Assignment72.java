package assignment;

import java.time.Duration;
//Launch amazon. Search shoes and press enter key using relative xpath
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Launch amazon. Search shoes and press enter key using relative xpath
public class Assignment72 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("Shoes");
		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));

		autosuggestion.get(1).click();

	}
}
