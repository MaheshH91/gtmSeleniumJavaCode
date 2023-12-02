package assignment;

/*//Goto flip kart Type shoes count
 *  number of autosuggestions  and click onto the last option*/
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment81 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement closeLogin = driver.findElement(By.xpath("//span[@role='button']"));
		closeLogin.click();
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchTextBox.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//form[@method='GET']/ul/li"));

		int countOfAutoSuggetion = autosuggestion.size();
		System.out.println(countOfAutoSuggetion);
		autosuggestion.get(countOfAutoSuggetion - 1).click();
	}
}
