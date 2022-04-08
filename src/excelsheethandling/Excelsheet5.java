
package excelsheethandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet4");
        int totalRow = MySheet.getLastRowNum();
        int totalcell = MySheet.getRow(0).getLastCellNum()-1;
        
        for(int i=0;i<=totalRow;i++)
        {
        	for(int j=0;j<=totalcell;j++)
        	{
        		Cell info = MySheet.getRow(i).getCell(j);
        		CellType type = info.getCellType();
        		if(type==CellType.STRING)
        			
        		{
        			String value = info.getStringCellValue();
        			System.out.print(value+" ");
        		}
        		else if(type==CellType.NUMERIC)
        		{
        			double value = info.getNumericCellValue();
        			System.out.print(value+" ");
        		}
        		else if(type==CellType.BOOLEAN)
        		{
        			boolean value = info.getBooleanCellValue();
        			System.out.print(value+" ");
        		}
        		
        	}
        	System.out.println();
        }
        
        }

}
