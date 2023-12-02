package fetchingValue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersProg {
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
