package amz.test;

import org.testng.annotations.Test;

import amz.source.Amz_HomePage;
import amz.source.Amz_LoginPage;

public class Amz_IT_02 extends LaunchQuit
{
	@Test
	public void Validationofsearchingproduct()
	{
		Amz_LoginPage a1=new Amz_LoginPage(driver);
		a1.username_();
		a1.continue_button_();
		a1.password_();
		a1.login_button_();
		Amz_HomePage a2=new Amz_HomePage(driver);
		a2.search_tf_();
		
		
	}
}
