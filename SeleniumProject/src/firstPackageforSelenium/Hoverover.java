package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement signInE = driver.findElement(By.xpath("//span[.='Sign In']"));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(signInE).perform();
		

	}

}
