package dataProvider_pkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderAss {

@DataProvider(name="dataInput")
public Object[][] method1(){
	return new Object[][] {{"Mahesh"},{"Riya"},{"Priya"},{"Sonu"},{"dada"},
		{"Raj"},{"Didi"},{"Gayatri"},{"Shree"},{"Anku"}};

}

@Test(dataProvider = "dataInput")
public void testMethood(String input) {
	String Checkname ="Riya";
	if(input.equals(Checkname)) {
		System.out.println("The input is "+input+" is present in the data provider input");
	}else {
		System.out.println("The input is "+input+" is NOT present in the data provider input");
	}
}
}
