package firstPackageforSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverQuite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2443);
		driver.quit();
		driver.get("https://www.facebook.com");
		

	}

}
