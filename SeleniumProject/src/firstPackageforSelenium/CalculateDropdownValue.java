package firstPackageforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculateDropdownValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		System.out.println(s1.getOptions().size());
//		driver.findElements(By.xpath(null))
//		System.out.println(s1.);
	}

}
