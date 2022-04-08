package excelsheethandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet2 {//reading whole excel..static coding

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet1");
		
		for(int i=0;i<=1;i++) //outer for loop for Row.0-1
		{
			for(int j=0;j<=4;j++)// inner for loop for cell..0-4
			{
		        String value = MySheet.getRow(i).getCell(j).getStringCellValue();
		        System.out.print(value+" ");
			}
			  System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
