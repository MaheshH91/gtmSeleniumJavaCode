package testNgOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Demo {

	@Test
	public void cordinates() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement countryname = driver.findElement(By.linkText("Spain"));
		Point xandy = countryname.getLocation();
		int x = xandy.getX();
		System.out.println(x);
		int y = xandy.getY();
		System.out.println(y);
		Reporter.log("Test case 1 last line");
	}
}
