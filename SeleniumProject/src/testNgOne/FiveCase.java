package testNgOne;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FiveCase {
	@Test
	public void launc() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}

	@Test
	public void launc2() {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void launc3() {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.in");
	}
}
