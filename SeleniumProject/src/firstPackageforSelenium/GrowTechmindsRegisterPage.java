package firstPackageforSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrowTechmindsRegisterPage {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/registration/");

		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		uname.sendKeys("Mahesh@email.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Mahesh@12343");
		WebElement fname = driver.findElement(By.xpath("//input[@id='4']"));
		fname.sendKeys("Mahesh");
		WebElement lname = driver.findElement(By.xpath("//input[@id='5']"));
		lname.sendKeys("Patil");

		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadioBtn.click();

		WebElement Skillsdd = driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		Skillsdd.click();
		WebElement skilltxtBox = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		skilltxtBox.sendKeys("Technical");
		List<WebElement> skillsOption = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
		skillsOption.get(0).click();
		// --------
		WebElement courseDd = driver.findElement(By.xpath("//*[@name='menu-802']"));
		Select s1 = new Select(courseDd);
		s1.selectByIndex(3);
		WebElement countryDd = driver.findElement(By.xpath("//*[@name='country']"));
		Select s3 = new Select(countryDd);
		s3.selectByIndex(8);
		WebElement presentAddress = driver.findElement(By.xpath("//*[@name='paddress']"));
		presentAddress.sendKeys("Survey No.140/2, Link Road Ashok Nagar Tathawade. 411033");

		WebElement permanantAddress = driver.findElement(By.xpath("//*[@name='permanentaddress']"));
		permanantAddress.sendKeys("Survey No.76, Ram nagar Baramati. ");

		WebElement pincode = driver.findElement(By.xpath("//*[@name='pincode']"));
		pincode.sendKeys("412306");

		WebElement religionDd = driver.findElement(By.xpath("//select[@name='menu-431']"));

		Select s4 = new Select(religionDd);
		s4.selectByValue("Hindu");

		WebElement chooseFile = driver.findElement(By.xpath("//p/span/input[@type='file']"));
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

		WebElement readyTorelocateChk = driver.findElement(By.xpath("//*[contains(@value,'bangalore')]"));
		readyTorelocateChk.click();

		WebElement upload = driver.findElement(By.name("file-935"));
		upload.sendKeys("C:\\LaptopData\\GroTechMindClass\\Vishal _3.2YOE.pdf");
		WebElement sumbitBtn = driver.findElement(By.xpath("//div[@class='row']//input[@value='Submit']"));
		sumbitBtn.click();
		/*
		 * WebElement spinnerAnm = driver.findElement(By.xpath(
		 * "//div[@class='row']//span[@class='wpcf7-spinner']")); WebDriverWait wait =
		 * new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.invisibilityOf(spinnerAnm));
		 * 
		 * WebElement thankYouMessageEle =
		 * driver.findElement(By.xpath("//div[contains(text(),'Thank')]")); String
		 * confirmMessage = thankYouMessageEle.getText();
		 * System.out.println(confirmMessage); Assert.assertTrue(confirmMessage.
		 * equalsIgnoreCase("Thank you for your message. It has been sent."));
		 * System.out.println("Assertion is matched");
		 */
	}

}
