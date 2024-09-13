package com.rahul.assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fs = new File("C:\\Users\\rahul\\git\\Automation_Rahul\\rahul-selenium\\PropertyFiles\\test.properties");
		
		
		FileInputStream fi = new FileInputStream(fs);
		
		Properties pro1 = new Properties();
		pro1.load(fi);
		
		System.out.println(pro1.getProperty("URL"));
		

	}

}
