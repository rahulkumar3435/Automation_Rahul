package com.rahul.assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File fs2 = new File("C:\\Users\\rahul\\git\\Automation_Rahul\\rahul-selenium\\ExcelFiles\\testData.xlsx");
		
		FileInputStream fis = new FileInputStream(fs2);
		
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		
		XSSFSheet sh = xs.getSheetAt(0);
		
		System.out.println(sh.getRow(0).getCell(0));
		

	}

}
