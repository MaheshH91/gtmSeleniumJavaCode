package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowTORightClick {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	
	WebElement mobileEle = driver.findElement(By.linkText("Mobiles"));
	Actions a1 = new Actions(driver);
	a1.contextClick(mobileEle).perform();
	
//	driver.close();

	}

}
