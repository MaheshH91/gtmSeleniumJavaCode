package dataProvider_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// facebook signup 4 value fname, lname, mobileNo,pass use 5 records
public class DataproviderAss2 {

	@DataProvider(name = "dataInput")
	public Object[][] method1() {
		return new Object[][] { {"Ram", "Tiwari", "8574963214", "ram@321435"},
		      {"Sita", "Sharma", "8574254100", "sita76543@123"},
		      {"Mohan", "Sham", "8574254165", "mohan@65gsy65"},
		      {"Shan", "Shan", "7452412540", "shan@34dud6f"},
		      {"Manish", "Tiwari", "7485963251", "manish@tiwari"}};

	}

	@Test(dataProvider = "dataInput")
	public void Login(String fname, String lname, String moNo, String passwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[.='Create new account']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(moNo);

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(passwd);

		Thread.sleep(3000);
		
		driver.close();
	}
}
