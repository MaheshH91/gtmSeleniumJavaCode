package firstPackageforSelenium;
//Launch Amazon Application and Select books and Enter human in text box and press enter

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		s1.selectByVisibleText("Books");
		s1.deselectByVisibleText("Books");
		s1.selectByValue("search-alias=stripbooks");
		s1.deselectByValue("search-alias=stripbooks");
		s1.selectByIndex(11);
		s1.deselectByIndex(11);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("human" + Keys.ENTER);
	}

}
