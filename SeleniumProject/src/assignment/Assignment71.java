package assignment;
//Perform action on each component except dropdown in the sample 
//html page shared using absolute xpath
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment71 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = System.getProperty("user.dir") + "\\learningHTML1.html";
		driver.get("file://" + url);
		WebElement userName = driver.findElement(By.xpath("/html/body/input[1]"));
		userName.sendKeys("India@gmail.com");
		WebElement hindTxtBox = driver.findElement(By.xpath("/html/body/input[2]"));
		hindTxtBox.sendKeys("CountryName@gmail.com");
		WebElement passwd = driver.findElement(By.xpath("/html/body/input[3]"));
		passwd.sendKeys("India@1234");
		WebElement fName = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		fName.sendKeys("Mahesh");
		WebElement boyCheckBox = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
		boyCheckBox.click();
		WebElement maleRadioBtn = driver.findElement(By.xpath("/html/body/input[4]"));
		maleRadioBtn.click();
		WebElement readyToRelocate = driver.findElement(By.xpath("/html/body/input[6]"));
		readyToRelocate.click();
		WebElement knowAboutUs = driver.findElement(By.xpath("/html/body/a"));
		String originalWindow = driver.getWindowHandle();

		Actions actions = new Actions(driver);
		actions.contextClick(knowAboutUs).perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		driver.switchTo().window(tabs.get(1));
		// Close the new tab
		driver.close();

		// Switch back to the original tab
		driver.switchTo().window(originalWindow);
		Thread.sleep(3432);
		// Quit the driver

		WebElement religionDropDown = driver.findElement(By.xpath("/html/body/select"));
		Select s1 = new Select(religionDropDown);

		Thread.sleep(2000);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByValue("1");
		Thread.sleep(2000);
		s1.selectByVisibleText("Hindu");

		WebElement signUpBtn = driver.findElement(By.xpath("/html/body/input[7]"));
		signUpBtn.click();

		driver.quit();
	}
}
