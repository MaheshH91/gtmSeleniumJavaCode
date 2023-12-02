package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledAndIsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/LaptopData/GroTechMindClass/learningHTML1.html");

		WebElement c = driver.findElement(By.id("121"));

		if(c.isEnabled()==true) {
			System.out.println("performed action on it");
		}
		else {
			System.out.println("Element is disabled performing action on it will execption called Element is not Interactable");
		}
		
	}

}
