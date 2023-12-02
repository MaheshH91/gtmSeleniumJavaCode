package firstPackageforSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandlingNaukari {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");

		WebElement googleLogin = driver.findElement(By.xpath("//button[@name='google-register']"));
		WebElement googleLogin1 = driver.findElement(By.xpath("//span[.='Google']"));

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
		driver.quit();

//	driver.close();
	}
}
