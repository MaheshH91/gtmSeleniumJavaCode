package firstPackageforSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		
		WebDriver driver2 = new FirefoxDriver();
		
		WebDriver driver3 = new SafariDriver();
		
//		 WebDriver driver4 = new OperaDriver();
	}

}
