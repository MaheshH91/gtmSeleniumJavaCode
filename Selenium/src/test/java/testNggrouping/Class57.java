package testNggrouping;

import org.testng.annotations.Test;

public class Class57 {

	@Test(groups = {"smoketesting","systemtesting"})
	public void method1() {
		System.out.println("1");
	}

	@Test(groups = {"regressiontesting","Integrationtesting"})
	public void method2() {
		System.out.println("2");
	}

	@Test(groups = {"regressiontesting","Integrationtesting","smoketesting"})
	public void method3() {
		System.out.println("3");
	}

	@Test(groups = {"Integrationtesting","smoketesting",})
	public void method4() {
		System.out.println("4");
	}

	@Test(groups = {"regressiontesting"})
	public void method5() {
		System.out.println("5");
	}
}
