package assignment;

// xpath for text in html code
// //tagname[.='text']
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment99 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement miniTV = driver.findElement(By.xpath("//a[.='Amazon miniTV']"));
		WebElement sellEle = driver.findElement(By.xpath("//a[text()='Sell']"));
		System.out.println(miniTV.getText());
		System.out.println(sellEle.getText());
		
	}
}
