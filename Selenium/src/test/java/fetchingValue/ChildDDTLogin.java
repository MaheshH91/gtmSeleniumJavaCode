package fetchingValue;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class ParentClassDDT3 {

	FileInputStream fis;

	Workbook wb;

	public Object[][] logincred() throws EncryptedDocumentException, IOException {

		fis = new FileInputStream("C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\ExcelSheet\\MaheshSheet.xlsx");
		wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("souceDemologin");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = cell.toString();
			}
		}

		return data;

	}
}

public class ChildDDTLogin extends ParentClassDDT3 {
	@Test(dataProvider = "loginData")
	public void testSauce(String username, String password) throws InterruptedException {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		// Add your test logic here...
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordEle = driver.findElement(By.id("password"));

		userName.sendKeys(username);
		passwordEle.sendKeys(password);

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

		Thread.sleep(3000);
		
		driver.close();
	}

	@DataProvider(name = "loginData")
	public Object[][] loginData() throws EncryptedDocumentException, IOException {
		return logincred();
	}
}
