package fetchingValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersProg2 {
WebDriver driver;

	@Test
	@Parameters("browser")
	public void google_india(String nameoftheBrowser) throws InterruptedException {
		if(nameoftheBrowser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		if(nameoftheBrowser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		if(nameoftheBrowser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement accountsAndList = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountsAndList).perform();
		Thread.sleep(3000);
		WebElement signIn = driver.findElement(By.xpath("//span[.='Sign in']"));
		signIn.click();
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("holkarmahesh1@gmail.com");
		WebElement unContinue = driver.findElement(By.id("continue"));
		unContinue.click();
		WebElement pwd = driver.findElement(By.name("password"));

		pwd.sendKeys("Maa@1234");
		WebElement pwdSubmit = driver.findElement(By.id("signInSubmit"));
		pwdSubmit.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
