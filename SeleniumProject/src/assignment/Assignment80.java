package assignment;

/*//Launch Google.co.in 
Type India
Find number of autosuggestions
Select 6th autosuggestion*/
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment80 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");

		driver.findElement(By.name("q")).sendKeys("India");
		
		List<WebElement> autoSuggetions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

		int countOfAutoSuggetion = autoSuggetions.size();
		System.out.println(countOfAutoSuggetion);
		Thread.sleep(3000);
		autoSuggetions.get(5).click();
	}
}
