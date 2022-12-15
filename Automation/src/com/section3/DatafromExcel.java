package com.section3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\Selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		String value1 = sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		//double value2 = sh1.getRow(1).getCell(0).getNumericCellValue();
		//System.out.println(value2);
		
		DataFormatter format = new DataFormatter();
		String value2 = format.formatCellValue(sh.getRow(1).getCell(0));
		System.out.println(value2);
		
		
	}

}
