package fb_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fb_source.Fb_login;

public class TestCase1WithMain {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Fb_login fb= new Fb_login(driver);
		fb.userName();
		fb.passWord_();
		fb.loginButton();
		
		
		
		
	}
}
