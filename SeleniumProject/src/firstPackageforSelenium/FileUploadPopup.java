package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://grotechminds.com/registration/");
		
		WebElement fileUpload =driver.findElement(By.name("file-935"));
		
		fileUpload.sendKeys("C:\\LaptopData\\GroTechMindClass\\Vishal _3.2YOE.pdf");
		

//		WebElement upload = driver.findElement(By.name("file-935"));
//		upload.sendKeys("C:\\LaptopData\\GroTechMindClass\\Vishal _3.2YOE.pdf");
//		WebElement sumbitBtn = driver.findElement(By.xpath("//div[@class='row']//input[@value='Submit']"));
//		sumbitBtn.click();
		

	}

}
