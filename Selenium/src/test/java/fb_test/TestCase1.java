package fb_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.Fb_login;

public class TestCase1 {
WebDriver driver;
	@Test
	public void loginWithValidData() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Fb_login fb = new Fb_login(driver);
		fb.userName();
		fb.passWord_();
		fb.loginButton();
	}
}
