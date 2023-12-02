package firstPackageforSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindowhandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/registration/createAccount");

		WebElement googleLogin1 = driver.findElement(By.xpath("//span[.='Google']"));
		

		googleLogin1.click();
		
		String parentWindowHanle = driver.getWindowHandle();
		
		Set<String> parentChild = driver.getWindowHandles();
		
		Iterator<String> itr = parentChild.iterator();
		 itr.next();
	}

}
