package testNgOne;

import org.testng.annotations.Test;

public class TestNg_Enabled_Prog {
@Test(enabled = false)
public void login() {
	System.out.println("login");
}
@Test(priority = -1)
public void registration() {
	System.out.println("Registration");
}
}
