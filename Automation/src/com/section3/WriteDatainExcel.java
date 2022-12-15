package com.section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\Selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(5).createCell(5).setCellValue("LikithKumarC");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Documents\\Selenium\\testdata.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("pass");

	}

}
