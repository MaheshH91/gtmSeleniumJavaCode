package testNgOne;

import org.testng.annotations.Test;

public class TestNg_InvocationCount {
@Test(invocationCount = 5)
public void login() {
	System.out.println("login");
}
@Test()
public void registration() {
	System.out.println("Registration");
}
}
