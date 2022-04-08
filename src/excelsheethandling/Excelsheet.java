package excelsheethandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

     public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
          FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
	
//	      String value = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
 //    	  System.out.println("Data from excel is "+value);
	
//	      double value1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	
//	      System.out.println("Data value "+value1);
	      
	Workbook file = WorkbookFactory.create(MyFile);
	Sheet MySheet = file.getSheet("Sheet1");
	Row MyRow = MySheet.getRow(0);
	Cell MyCell = MyRow.getCell(0);
	String Values = MyCell.getStringCellValue();

    System.out.println(MySheet.getRow(0).getCell(0).getStringCellValue());
    System.out.println(MySheet.getRow(0).getCell(1).getStringCellValue());
     
     
     
     
     
     
     
     }
}
