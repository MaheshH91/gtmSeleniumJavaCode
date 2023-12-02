package amzn.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_HomePage {
	WebDriver driver;
	//Step 1
		@FindBy(xpath="//input[@id='twotabsearchtextbox']")	
		WebElement search_tf;
		@FindBy(xpath="(//input)[6]")	
		WebElement serach_button;	
	//step 2	
		public void search_tf_() {
			search_tf.sendKeys("t shirt");
			search_tf.sendKeys(Keys.ENTER);
		}
		//step 3
		public Amz_HomePage(	WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}}
