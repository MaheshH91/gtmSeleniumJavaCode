package testng5ClassCrossbrowsertesting2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5 extends LaunchAndQuite {
	@Test
	public void scenario1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		WebElement userNameEle = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordEle = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtnEle = driver.findElement(By.xpath("//input[@id='login-button']"));

		userNameEle.sendKeys("standard_user");
		passwordEle.sendKeys("secret_sauce");
		loginBtnEle.click();

		List<WebElement> addcart = driver.findElements(By.xpath("//div//button[.='ADD TO CART']"));
		
		addcart.get(1).click();
		addcart.get(2).click();
		addcart.get(3).click();
		addcart.get(5).click();
		
		WebElement cartBtn = driver.findElement(By.xpath("//div[@id='shopping_cart_container']//*[@data-icon='shopping-cart']"));
		cartBtn.click();
		WebElement checkOutBtn = driver.findElement(By.xpath("//a[.='CHECKOUT']"));
		checkOutBtn.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		WebElement continueBtn = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		firstName.sendKeys("Mahesh");
		lastName.sendKeys("Patil");
		postalCode.sendKeys("412234");
		continueBtn.click();
		WebElement finishBtn = driver.findElement(By.xpath("//a[.='FINISH']"));
		
		finishBtn.click();
		
		WebElement thanksMsgEle = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		String thanksMsg =thanksMsgEle.getText();
		
		Assert.assertEquals(thanksMsg,"THANK YOU FOR YOUR ORDER", "Thanks Msg is matched and assertion is passed");
		
	}
}
