package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch a browser search for the first president, 
get & print the title of the page in a vertical manner*/
class Assignment64 {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.google.co.in");
			WebElement textBoxField = driver.findElement(By.name("q"));
			textBoxField.sendKeys("First President of India");
			textBoxField.submit();

			String pageTitle = driver.getTitle();
			int titleLength = pageTitle.length();

			for (int i = 0; i < titleLength; i++) {
				System.out.println(pageTitle.charAt(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}
}
