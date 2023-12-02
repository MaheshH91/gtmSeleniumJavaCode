package testNgOne;

import org.testng.annotations.Test;

public class TestNg_Para_All_Ass {
@Test(priority = 1,invocationCount = 5,enabled = true)
public void login() {
	System.out.println("login method here we use priority = 1,invocationCount = 5,enabled = true");
}
@Test(priority = 0,invocationCount = 5,enabled = false)
public void registration() {
	System.out.println("Registration1 method == priority = 1,invocationCount = 5,enabled = false");
}
@Test(priority = -2,invocationCount = 2,enabled = true)
public void registration2() {
	System.out.println("Registration2 method == priority = 1,invocationCount = 2,enabled = true");
}

}
