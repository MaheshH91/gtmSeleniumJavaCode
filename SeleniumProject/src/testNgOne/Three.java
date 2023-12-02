package testNgOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Three {
	@BeforeSuite
	public void bs() {
		System.out.println("Before suite");

	}

	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}

	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}

	@Test
	public void test() {
		System.out.println("Inside a test");
	}

	@AfterMethod
	public void am() {
		System.out.println("After method");
	}

	@AfterClass
	public void ac() {
		System.out.println("After class");
	}

	@AfterTest
	public void at() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void as() {
		System.out.println("AfterSuite");
	}
}
