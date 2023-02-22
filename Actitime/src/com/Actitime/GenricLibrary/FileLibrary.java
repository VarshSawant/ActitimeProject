package com.Actitime.GenricLibrary;
//Write once use it multiple time 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary 
{    String path="./Testdata/commondata.property";

     public String readDataFromPropertyFile(String key) throws IOException
     { 
    	 FileInputStream fis= new FileInputStream(path);
    	 Properties p= new Properties();
    	 p.load(fis);
    	
    	 String value = p.getProperty(key);
    	return value ;
     }
     public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
     {
    	 FileInputStream f= new FileInputStream("./Testdata/TESTDATA.xlsx");
    	Workbook wb= WorkbookFactory.create(f);
     String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
     return value;
     }
}
