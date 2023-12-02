package firstPackageforSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopup3 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://grotechminds.com/registration/");

		WebElement fileUpload = driver.findElement(By.name("file-935"));
		String filePath = System.getProperty("user.dir") + "\\Resume.pdf";
		driver.executeAsyncScript("arguments[0].click()", args);
	}

}
