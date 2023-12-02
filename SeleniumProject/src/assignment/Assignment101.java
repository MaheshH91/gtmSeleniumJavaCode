package assignment;

//Launch amazon.Search a product and go to payments page
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment101 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		searchText.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver
				.findElements(By.xpath("//div/div[@class='s-suggestion-container']/div"));

		autosuggestion.get(0).click();

		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));

		products.get(0).click();

		Set<String> parentChildHandle = driver.getWindowHandles();

		Iterator<String> itr = parentChildHandle.iterator();
		String id1 = itr.next();
		String id2 = itr.next();

		driver.switchTo().window(id2);
		WebElement buyNow = driver.findElement(By.xpath("//*[@id='buy-now-button']"));

		buyNow.click();
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("holkarmahesh1@gmail.com");
		WebElement unContinue = driver.findElement(By.id("continue"));
		unContinue.click();
		WebElement pwd = driver.findElement(By.name("password"));

		pwd.sendKeys("Maa@1234");
		WebElement pwdSubmit = driver.findElement(By.id("signInSubmit"));
		pwdSubmit.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='payChangeButtonId']")).click();
		driver.findElement(By.xpath("//input[contains(@value,'COD')]")).click();


	}
}
