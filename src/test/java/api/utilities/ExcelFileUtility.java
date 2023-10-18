package api.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	public String readFromExcelFile(String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fi= new FileInputStream(IContantUtility.excelFilePath);
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		
		DataFormatter formatter= new DataFormatter();
		String data;
		try {
			data= formatter.formatCellValue(cell);
		}
		catch(Exception e) {
			data= "";
		}
		book.close();
		fi.close();
		return data;
		
	}

}
