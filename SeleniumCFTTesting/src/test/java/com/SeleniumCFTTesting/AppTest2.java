package com.SeleniumCFTTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest2 {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\LaptopData\\SeleniumJava\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.google.com");
	}
}
