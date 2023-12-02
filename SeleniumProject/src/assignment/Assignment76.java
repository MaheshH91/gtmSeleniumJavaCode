package assignment;
//Using relative  xpath click onto the link on the html page
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment76 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("C:\\LaptopData\\GroTechMindClass\\learningHTML1.html");
		
		WebElement link = driver.findElement(By.xpath("//a"));
		
		link.click();
	}
}
