package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/LaptopData/GroTechMindClass/learningHTML1.html");

		WebElement hintTextField = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hintTextField.sendKeys("password petname");

		WebElement firstNameTextField = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		firstNameTextField.sendKeys("Mahesh");
		WebElement boyCheckBOx = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boyCheckBOx.click();

	}

}
