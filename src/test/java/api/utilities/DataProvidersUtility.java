package api.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvidersUtility {

	@DataProvider(name= "Data")
	public String[][] getAllData(String sheetName) throws EncryptedDocumentException, IOException{
		FileInputStream fi= new FileInputStream(IContantUtility.excelFilePath);
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet(sheetName);
		int rowCount= sheet.getLastRowNum();
		int cellCount= sheet.getRow(1).getLastCellNum();
		ExcelFileUtility eUtil= new ExcelFileUtility();
		
		String apiData[][]= new String[rowCount][cellCount];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<=cellCount; j++)
			{
				apiData[i-1][j]= eUtil.readFromExcelFile(sheetName, i, j);
			}
		}
		return apiData;
	}
	
	@DataProvider(name= "UserNames")
	public String[] getUserName(String sheetName) throws EncryptedDocumentException, IOException{
		FileInputStream fi= new FileInputStream(IContantUtility.excelFilePath);
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheet(sheetName);
		int rowCount= sheet.getLastRowNum();
		ExcelFileUtility eUtil= new ExcelFileUtility();
		
		String apiData[]= new String[rowCount];
		
		for(int i=1; i<rowCount; i++)
		{
				apiData[i-1]= eUtil.readFromExcelFile(sheetName, i, 1);
		}
		return apiData;
	}
	
}
