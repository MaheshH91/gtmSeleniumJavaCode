package firstPackageforSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://grotechminds.com/registration/");
		
		WebElement fileUpload =driver.findElement(By.name("file-935"));
		
//		fileUpload.sendKeys("C:\\LaptopData\\GroTechMindClass\\Vishal _3.2YOE.pdf");
		

		 WebElement chooseFile =
		 driver.findElement(By.xpath("//p/span/input[@type='file']"));
		 driver.executeScript("arguments[0].click()", chooseFile);
		 
		// Create a Robot instance to simulate keyboard events.
		Robot robot = new Robot();

		// Wait for a brief moment to ensure the file dialog is open.
		
			Thread.sleep(1000);
		
		// Use the Robot class to type the file path and press Enter.
		String filePath = System.getProperty("user.dir") + "\\Resume.pdf"; // Replace with the actual file path.
		StringSelection stringSelection = new StringSelection(filePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		robot.delay(350);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


	}

}
