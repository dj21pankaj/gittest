package kitePomTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testClassNG {
	WebDriver driver;
	Sheet MySheet;
	LoginNG login;
	PinNG pin;
	MainNG main;

	@Parameters("BrowserName")
  @BeforeClass
  public void LunchBrowser(String browser) throws EncryptedDocumentException, IOException 
  {
		if(browser.equals("Chrome")) 
		{
	  Reporter.log("Lunching Chrome Browser",true);
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    driver=new ChromeDriver(opt);
		}
		else if(browser.equals("Firefox")) 
		{
			Reporter.log("Lunching FireFox Browser",true);
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\FireFox\\geckodriver.exe");
			FirefoxOptions opt=new FirefoxOptions();
			opt.addArguments("--disable-notifications");
			driver=new FirefoxDriver(opt);
			
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize(); 
		Reporter.log("Browser Lunch Succesful",true);
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\ExcelSheet\\exceltest.xlsx");
		MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		login=new LoginNG(driver);
		pin=new PinNG(driver);
		main=new MainNG(driver);
		
  }
  @BeforeMethod
  public void logintokitepage() 
  {
          String USERID = MySheet.getRow(0).getCell(0).getStringCellValue();
          String PASWORD = MySheet.getRow(0).getCell(1).getStringCellValue();
          String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
          Reporter.log("Entering UserID and Password",true);
          login.senduserid(USERID);
          login.sendpassword(PASWORD);
          login.clickloginButton();
          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
          Reporter.log("Entering PIN",true);
          pin.sendpin(PIN);
          pin.clickCountiButton();
          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  @Test
  public void validateuserID() 
  {
	     Reporter.log("Validating UserID",true);   
	     String expecteduserID = MySheet.getRow(0).getCell(0).getStringCellValue();
	     String actualuserID = main.getactualuserid();
	     Assert.assertEquals(expecteduserID,actualuserID,"expected and actual not match TC fails");
	     Reporter.log("UserID Validate Sucssefully TC is Pass",true);
  }
  
  @AfterMethod 
  public void logoutmainpage() throws InterruptedException 
  {
	  Reporter.log("LogOut Kite App",true);
	    main.clickLogoutButton();
  }
  @AfterClass
  public void browserclose() 
  {
	  Reporter.log("Closing Browser",true);
	    driver.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
