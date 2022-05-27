package com.seleniumwebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileReaderFromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Think_Quotient.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		String username=rw.getCell(1).getStringCellValue();
	    String password=rw.getCell(2).getStringCellValue();
	    int mobilenumber=(int) rw.getCell(4).getNumericCellValue();
	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(mobilenumber);
	}

}
