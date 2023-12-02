package assignment;

//Automate Grotech minds website

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment78 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/registration/");

		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		uname.sendKeys("Mahesh@email.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Mahesh@12343");
		WebElement fname = driver.findElement(By.xpath("//input[@id='4']"));
		fname.sendKeys("Mahesh");
		WebElement lname = driver.findElement(By.xpath("//input[@id='5']"));
		lname.sendKeys("Patil");

		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadioBtn.click();

		WebElement Skills = driver.findElement(By.xpath("//*[@name='menu-600']"));
		Select s1 = new Select(Skills);
		s1.selectByIndex(1);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement courseDd = driver.findElement(By.xpath("//select[@name='menu-802']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='menu-802']")));

		Select s2 = new Select(courseDd);
		s2.selectByIndex(3);
		WebElement countryDd = driver.findElement(By.xpath("//*[@name='country']"));
		Select s3 = new Select(countryDd);
		s3.selectByIndex(8);
		WebElement presentAddress = driver.findElement(By.xpath("//*[@name='paddress']"));
		presentAddress.sendKeys("Survey No.140/2, Link Road Ashok Nagar Tathawade. 411033");

		WebElement permanantAddress = driver.findElement(By.xpath("//*[@name='permanentaddress']"));
		permanantAddress.sendKeys("Survey No.76, Ram nagar Baramati. ");

		WebElement pincode = driver.findElement(By.xpath("//*[@name='pincode']"));
		pincode.sendKeys("412306");

		WebElement religionDd = driver.findElement(By.xpath("//select[@name='menu-431']"));

		Select s4 = new Select(religionDd);
		s4.selectByValue("Hindu");

		WebElement readyTorelocateChk = driver.findElement(By.xpath("//*[contains(@value,'bangalore')]"));
		readyTorelocateChk.click();

		WebElement upload = driver.findElement(By.name("file-935"));
		upload.sendKeys("C:\\LaptopData\\GroTechMindClass\\Vishal _3.2YOE.pdf");
		WebElement sumbitBtn = driver.findElement(By.xpath("//div[@class='row']//input[@value='Submit']"));
		sumbitBtn.click();

		WebElement spinnerAnm = driver.findElement(By.xpath("//div[@class='row']//span[@class='wpcf7-spinner']"));
		wait.until(ExpectedConditions.invisibilityOf(spinnerAnm));
		Thread.sleep(3000);
		WebElement thankYouMessageEle = driver.findElement(By.xpath("//div[contains(text(),'Thank')]"));
		String confirmMessage = thankYouMessageEle.getText();
		System.out.println(confirmMessage);
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thank you for your message. It has been sent."));
		System.out.println("Assertion is matched");

	}
}
