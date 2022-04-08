package kitePOMWithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet3");
		String value = MySheet.getRow(0).getCell(0).getStringCellValue();
		String value1 = MySheet.getRow(0).getCell(1).getStringCellValue();
         String value2 = MySheet.getRow(0).getCell(2).getStringCellValue();
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		
        ChromeOptions opt=new ChromeOptions();// feature of chrome
        opt.addArguments("headless");
        WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		LoginDDF login=new LoginDDF(driver);
		login.senduserid(value);
		login.sendpassword(value1);
		login.clickloginButton();
		
		Thread.sleep(1000);
		
		PINDDF pin=new PINDDF(driver);
		pin.sendpin(value2);
		pin.clickCountiButton();
		
		Thread.sleep(1000);
		
		MainDDF main=new MainDDF(driver);
		main.validateUserID(value);
		main.clickLogoutButton();
		 
		driver.close();

	}

}
