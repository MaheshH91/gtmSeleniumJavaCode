package fb_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login {

	// locate each element with @FindBy
	// Create separate methods
	// initialize each elements
	
	ChromeDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	public void userName() {
		username.sendKeys("holkarmahesh1@gmail.com");
		
	}
	public void passWord_() {
		password.sendKeys("holkarmahesh1@gmail.com");
		
	}
	public void loginButton() {
		login_button.click();
		
	}
	
	//initilize elements
	public Fb_login(WebDriver driver) {//constructor initialize elements
		PageFactory.initElements(driver, this);//this keywor]]
	}
}
