package testNgOne;

import org.testng.annotations.Test;

public class Priority_Prog {
@Test
public void login() {
	System.out.println("login");
}
@Test(priority = -1)
public void registration() {
	System.out.println("Registration");
}
}
