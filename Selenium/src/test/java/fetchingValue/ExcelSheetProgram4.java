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

public class ExcelSheetProgram4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				"C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\ExcelSheet\\MaheshSheet.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		String emptyvalue = wb.getSheet("Payment_details").getRow(1).getCell(1).getStringCellValue();

		System.out.println(emptyvalue);
				
	}

}
