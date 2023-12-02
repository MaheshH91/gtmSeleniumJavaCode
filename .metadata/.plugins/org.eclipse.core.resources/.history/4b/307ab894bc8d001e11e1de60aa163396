package testng5ClassCrossbrowsertesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchAndQuite {
	WebDriver driver;


	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameoftheBrowser) throws InterruptedException {

		if(nameoftheBrowser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		if(nameoftheBrowser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		if(nameoftheBrowser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/v1/");

		
	}

	@AfterMethod
	public void quite() throws InterruptedException, IOException {
		TakesScreenshot s1 = (TakesScreenshot) driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				System.getProperty("user.dir")+"\\screenshots\\S1" + Math.random() + ".png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);
		driver.quit();
	}

}
