package dataProvider_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class66DataProvider2 {
	@DataProvider(name = "data1")
	public Object[][] amazonLogin() {
		Object data[][]=new Object[2][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		
		return data;

	}
	@Test(dataProvider = "data1")
	public void loginOnAmazon(String unValue, String pwdValue) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordEle = driver.findElement(By.id("password"));

		userName.sendKeys(unValue);
		passwordEle.sendKeys(pwdValue);

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

		
	}
}
