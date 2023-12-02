package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/registration/");
		
		WebElement Skills = driver.findElement(By.xpath("//*[@name='menu-600']"));
		Select s1 = new Select(Skills);
		s1.selectByIndex(1);
		
		WebElement countryDd = driver.findElement(By.xpath("//*[@name='country']"));
		Select s3 = new Select(countryDd);
		s3.selectByIndex(8);
		
		WebElement chkBox = driver.findElement(By.xpath("//input[@name='checkbox-833[]']"));
		chkBox.click();
		
		
		
		

	}

}
