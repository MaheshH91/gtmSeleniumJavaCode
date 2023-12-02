package testngAssingment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase4 extends LaunchAndQuite {
	@Test
	public void scenario1() throws InterruptedException {

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
		driver.findElement(By.xpath("//input[starts-with(@value,'SelectableAddCreditCard')]")).click();

//		driver.findElement(By.cssSelector("#orderSummaryPrimaryActionBtn-announce")).click();

	}
}
