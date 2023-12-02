package dataProvider_pkg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class66DataProvider3 {
	@DataProvider(name = "data1")
	public Object[][] amazonLogin() {
		Object data[][]=new Object[2][2];
		data[0][0]="ram";
		data[0][1]="ram123";
		data[1][0]="seeta";
		data[1][1]="seeta123";
		
		return data;

	}
	@Test(dataProvider = "data1")
	public void loginOnAmazon(String unValue, String pwdValue) {
		System.out.println(unValue+pwdValue);
		
	}
}
