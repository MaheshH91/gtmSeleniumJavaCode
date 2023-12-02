package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChessGameDragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/registration/");

		driver.switchTo().frame("h5p-iframe-1");
		
		
		driver.findElements(By.xpath(""));
	}

}
