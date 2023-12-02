package assignment;

//Accept Java script pop ups in the html page
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment88 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("file:///C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\learningHTML1.html");

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
