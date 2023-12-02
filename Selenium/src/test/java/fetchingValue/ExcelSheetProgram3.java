package fetchingValue;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelSheetProgram3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				"C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\ExcelSheet\\MaheshSheet.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		String mobileNo =NumberToTextConverter.toText(wb.getSheet("mobile_number").getRow(1).getCell(1).getNumericCellValue());
		System.out.println(mobileNo);
				
	}

}
