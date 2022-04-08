package excelsheethandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class Excelsheet1 {  //single row..this is static coding..fix values
  
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet1");
		
		for(int i=0;i<=4;i++) 
		{
		String value = MySheet.getRow(0).getCell(i).getStringCellValue();// vary in cell and row are constant
		System.out.print(value+" ");
		}

	}

}
