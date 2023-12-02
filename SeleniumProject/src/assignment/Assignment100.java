package assignment;

//Launch amazon and type shoes.
//Select first shoe from result. 
//First close the child window and then parent window
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment100 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Shoe");
		searchBox.submit();

		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));

		products.get(0).click();

		String parentId = driver.getWindowHandle();
//		System.out.println("Parent id is : " + parentId);
		Set<String> parentChildId = driver.getWindowHandles();

		System.out.println("ParentChild id are : " + parentChildId);

		Iterator<String> pc = parentChildId.iterator();
		String id1 = pc.next();
		String id2 = pc.next();

		driver.switchTo().window(id2);

		driver.close();
		driver.switchTo().window(id1);
	
		Thread.sleep(2000);
		driver.close();

	}
}
