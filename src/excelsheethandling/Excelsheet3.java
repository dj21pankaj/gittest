package excelsheethandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet3 {//Dynamic coding

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet1");
		
	//  methode for getting row count
		int lastrownum = MySheet.getLastRowNum();
		System.out.println("Count of total row "+lastrownum);
	    int totalnumofrow =lastrownum;// roe always start from..0
        
	//	methode for getting cell count
		int lastcellnum = MySheet.getRow(0).getLastCellNum();
		System.out.println("Cont of total cell "+lastcellnum); 
		int totalnumofcell = lastcellnum-1;// cell start from 1..so geting match with row lastcellnum-1..so it start from 0
		
		for(int i=0;i<=totalnumofrow;i++) 
		{
			for(int j=0;j<=totalnumofcell;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
			
		}
	}

	
	}


