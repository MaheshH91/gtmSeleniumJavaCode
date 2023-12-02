package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://amazon.in");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		
		
		WebElement mobileEle = driver.findElement(By.linkText("Mobiles"));

	}

}
