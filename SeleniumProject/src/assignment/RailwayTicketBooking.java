package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailwayTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement fromSt = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		WebElement toSt = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));

		fromSt.sendKeys("KSR BENGALURU - SBC");
		Thread.sleep(2000);
		fromSt.sendKeys(Keys.DOWN);
		fromSt.sendKeys(Keys.ENTER);
		toSt.sendKeys("DELHI - DLI (NEW DELHI)");
		Thread.sleep(2000);
		toSt.sendKeys(Keys.DOWN);
		toSt.sendKeys(Keys.ENTER);


		   WebElement date=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			
			date.click();
			date.clear();
			date.sendKeys("31/12/2023");
//			driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next-icon')]")).click();
//			driver.findElement(By.xpath("//a[.='31']")).click();

			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='journeyQuota']/div/div[3]/span")).click();
			

			List<WebElement> categories=driver.findElements(By.xpath("//div[contains(@class,'ui-dropdown-items')]/ul/p-dropdownitem/li"));


			Thread.sleep(4000);
			categories.get(0).click();
			System.out.println(categories);

			Thread.sleep(5000);

			
			driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
			Thread.sleep(3000);
		driver.quit();


//		//==
//		// Find the date picker element
//		WebElement datePicker = driver.findElement(By.id("jDate"));
//
//		// Click the date picker element to open the calendar
//		datePicker.click();
//
//		// Select the desired date from the calendar
//		WebElement date = driver.findElement(By.xpath("//td[@data-date='2023-11-13']"));
//		date.click();
//
//		WebElement dateEle = driver.findElement(By.cssSelector("//input[contains(@class,'ng-tns-c58-10')]"));
//		dateEle.click();
//
		
//		
//		WebElement submitButton = driver.findElement(By.xpath("//button[@class='search_btn train_Search']"));
//		submitButton.click();

		
	}

}
