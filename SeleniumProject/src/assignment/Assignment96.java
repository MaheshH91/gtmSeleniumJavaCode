package assignment;

//Launch Edgedriver browser Type Mathematics and Enter
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment96 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='sb_form_q']")); // linkText

		searchBox.sendKeys("Mathematics");
		searchBox.sendKeys(Keys.ENTER);
		
		

	}
}
