package assignment;

//Launch naukri.com Inspect continue with Google Find parent and child Id , 
//move the control to child and close the child tab

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment91 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/registration/createAccount");

		WebElement googleLogin = driver.findElement(By.xpath("//button[@name='google-register']"));
//		WebElement googleLogin1 = driver.findElement(By.xpath("//span[.='Google']"));

		googleLogin.click();
		String parentId = driver.getWindowHandle();
		System.out.println("Parent id is : " + parentId);
		Set<String> parentChildId = driver.getWindowHandles();

		System.out.println("ParentChild id are : " + parentChildId);

		Iterator<String> pc = parentChildId.iterator();
		String id1 = pc.next();
		String id2 = pc.next();

		driver.switchTo().window(id2);
		Thread.sleep(3000);
		driver.close();


	}
}
