package assignment;

import java.time.Duration;

//Login to amazon using relative xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a program of xpath for link in html code
public class Assignment74 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("C:\\LaptopData\\GroTechMindClass\\learningHTML1.html");
		WebElement link = driver.findElement(By.xpath("/html/body/a"));

		link.click();

	}
}
