package assignment;

//Use try and catch block for file upload in grotech minds registrations

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment90 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");

		WebElement fileUpload = driver.findElement(By.name("file-935"));
		try {
			fileUpload.sendKeys("C:\\LaptopData\\GroTechMindClass\\Vishal _3.2YOE.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
