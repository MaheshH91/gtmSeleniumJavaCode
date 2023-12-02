package testNgOne;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Two {
	@Test
	public void launc() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
}
