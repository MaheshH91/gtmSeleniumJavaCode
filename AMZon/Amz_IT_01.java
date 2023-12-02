package amz.test;

import org.testng.annotations.Test;

import amz.source.Amz_LoginPage;

public class Amz_IT_01 extends LaunchQuit
{
@Test
public void Toverifyloginfunctionality()
{
	Amz_LoginPage a1=new Amz_LoginPage(driver);
	a1.username_();
	a1.continue_button_();
	a1.password_();
	a1.login_button_();
	
	
}
}
