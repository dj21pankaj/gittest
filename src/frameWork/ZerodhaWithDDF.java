package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet MySheet = File.getSheet("Sheet3");
		String value = MySheet.getRow(0).getCell(0).getStringCellValue();
		String value1 = MySheet.getRow(0).getCell(1).getStringCellValue();
         String value2 = MySheet.getRow(0).getCell(2).getStringCellValue();
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='userid']"));
		userId.sendKeys(value);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(value1);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(value2);
		
		WebElement countinousbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		countinousbutton.click();
		
		Thread.sleep(1000);
		WebElement userId1 = driver.findElement(By.xpath("//span[@class='user-id']"));
        String actualtext = userId1.getText();
      
        
        String expectedtext = value;
        
        if(actualtext.equals(expectedtext))
        {
        	System.out.println("Maching right TC Pass");
        }
        else
        {
        	System.out.println("Maching not found TC Fail");
        	
        }
        
        userId1.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@target='_self']")).click();
        Thread.sleep(1000);
        driver.close();
		
		
		
		
		
		
		
		
		
	}

}
