package amzn.source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amz_LoginPage 
{
	WebDriver driver;
//Step 1
	@FindBy(name="email")	
	WebElement username;
	
	@FindBy(id="continue")	
	WebElement continue_button;
	

	@FindBy(xpath="//input[@id='ap_password']")	
	WebElement password;
	

	@FindBy(id="signInSubmit")	
	WebElement login_button;
	
//step 2
	
	public void username_() {
		username.sendKeys("8125800347");
	}
	
	public void continue_button_() {
		continue_button.click();
	}
	
	public void password_() {
																																password.sendKeys("amazon84");
	}
	
	public void login_button_() {
		login_button.click();
	}
	//step 3
	
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	
	
	
	
	
}
