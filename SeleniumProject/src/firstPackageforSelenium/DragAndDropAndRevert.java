package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAndRevert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/drag-and-drop/");

		WebElement drag = driver.findElement(By.id("drag7"));
		WebElement drop = driver.findElement(By.id("div2"));

		Actions a1 = new Actions(driver);

		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		WebElement revertdrop = driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		a1.dragAndDrop(drag, revertdrop).perform();
	}

}
