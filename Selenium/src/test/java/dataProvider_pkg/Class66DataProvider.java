package dataProvider_pkg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class66DataProvider {
@DataProvider(name="data1")
public Object[][] method1(){
	return new Object[][] {{10},{20},{30}};

}
@DataProvider(name="data2")
public Object[][] method2(){
	return new Object[][] {{"ram"},{"Vishnu"},{"Vivek"}};

}
@Test(dataProvider = "data1")
public void testcase1(int value) {
	int sum=100+value;
//	System.out.println(value);
	Reporter.log("Hello ",sum);
}
@Test(dataProvider = "data2")
public void testcase1(String value) {
//	value.concat(" works at Tech Mahindra");
	System.out.println(value.concat(" works at Tech Mahindra"));
}
}
