package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch flipkart and get the title of the page & print it*/
class Assignment62 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
//		driver.close();
	}
}
