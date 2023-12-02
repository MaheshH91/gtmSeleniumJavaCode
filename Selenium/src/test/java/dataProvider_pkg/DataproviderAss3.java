package dataProvider_pkg;

import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderAss3 {

  @DataProvider(name = "cricketers")
  public Object[][] method1() {
    return new Object[][] {
      {"Rohit Sharma"}, {"KL Rahul"}, {"Virat Kohli"}, {"Suryakumar Yadav"},
      {"Shreyas Iyer"}, {"Rishabh Pant"}, {"Hardik Pandya"}, {"Ravindra Jadeja"},
      {"Mohammed Shami"}, {"Bhuvneshwar Kumar"}, {"Jasprit Bumrah"}
    };
  }

  @Test(dataProvider = "cricketers")
  public void testMethood(String cricketerName) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Indian criketor name:");
    String checkName = sc.nextLine();
    if (cricketerName.equals(checkName)) {
      System.out.println(cricketerName + " is present in the data provider input.");
    } 
    sc.close();
  }
}
