package fetchingValue;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExcelSheetProgram2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				"C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\ExcelSheet\\MaheshSheet.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		String uname = wb.getSheet("Login_Cred").getRow(1).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("Login_Cred").getRow(1).getCell(1).getStringCellValue();

		System.out.println(uname);
		System.out.println(pwd);
				
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in");
//		driver.manage().window().maximize();
//		WebElement accountsAndList = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
//		Actions a1 = new Actions(driver);
//		a1.moveToElement(accountsAndList).perform();
//		WebElement signIn = driver.findElement(By.xpath("//span[.='Sign in']"));
//		signIn.click();
//		WebElement un = driver.findElement(By.id("ap_email"));
//		un.sendKeys(uname);
//		WebElement unContinue = driver.findElement(By.id("continue"));
//		unContinue.click();
//		WebElement pwd = driver.findElement(By.name("password"));
//
//		pwd.sendKeys(password);
//		WebElement pwdSubmit = driver.findElement(By.id("signInSubmit"));
//		pwdSubmit.click();

	}

}
