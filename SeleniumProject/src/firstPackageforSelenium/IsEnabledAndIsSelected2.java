package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledAndIsSelected2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/LaptopData/GroTechMindClass/learningHTML1.html");

		WebElement c = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		boolean a = c.isSelected();
		System.out.println(a);
		if (a) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}

	}

}
