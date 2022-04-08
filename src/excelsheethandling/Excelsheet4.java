package excelsheethandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet2");
		CellType type1 = MySheet.getRow(0).getCell(0).getCellType();
		CellType type2 = MySheet.getRow(0).getCell(1).getCellType();
		CellType type3 = MySheet.getRow(0).getCell(2).getCellType();
		CellType type4 = MySheet.getRow(0).getCell(3).getCellType();
	  
	    System.out.println(type1);
	    System.out.println(type2);
	    System.out.println(type3);
	    System.out.println(type4);
	    
	    
	    String value1 = MySheet.getRow(0).getCell(0).getStringCellValue();
	    double value2 = MySheet.getRow(0).getCell(1).getNumericCellValue();
	    boolean value3 = MySheet.getRow(0).getCell(2).getBooleanCellValue();
	    double value4 = MySheet.getRow(0).getCell(3).getNumericCellValue();
	    
	    System.out.println(value1);
	    System.out.println(value2);
	    System.out.println(value3);
	    System.out.println(value4);
	    
	}

}
