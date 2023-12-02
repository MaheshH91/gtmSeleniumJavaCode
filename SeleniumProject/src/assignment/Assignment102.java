package assignment;

//WAP to perform drag and drop Postman in Gotechminds ->Automate me->drag and drop page
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment102 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		WebElement drag = driver.findElement(By.xpath("//*[@id='drag7']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='div2']"));

		Actions a1 = new Actions(driver);

		a1.dragAndDrop(drag, drop).perform();
	}
}
