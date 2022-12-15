package automation.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

		public String getDatafromProperties(String Key) throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\Selenium\\commondata.properties");
			Properties pobj= new Properties();
			pobj.load(fis);
			String value = pobj.getProperty(Key);
			return value;	
		}
		
		public String getDatafromExcelsheet(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\Selenium\\testdata.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet(sheetname);
			DataFormatter format = new DataFormatter();
			String value = format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
			return value;
			
		}

	}


