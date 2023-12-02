package assignment;

//Find the coordinates of the location using getLocation() method

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment83 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement MobileLink = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));

		Point xandy = MobileLink.getLocation();
		int x = xandy.getX();
		System.out.println(x);
		int y = xandy.getY();
		System.out.println(y);

	}
}
