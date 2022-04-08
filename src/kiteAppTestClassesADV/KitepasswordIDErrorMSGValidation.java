package kiteAppTestClassesADV;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseClass1;
import kitePOMClassesADV.LoginNG;
import utility.Utility1;

public class KitepasswordIDErrorMSGValidation extends BaseClass1
{
	LoginNG login;
	@BeforeClass
	public void lunchbrowser() 
	{
		lunchBrowser();
		login=new LoginNG(driver);
		
	}
	@BeforeMethod
	public void loginkiteApp() throws EncryptedDocumentException, IOException
	
	{
		login.senduserid(Utility1.readDataFromExcel(0, 0));
		login.clickloginButton();
	}
  @Test
  public void validatepasswordIDErrorMsg() throws EncryptedDocumentException, IOException 
  
  {
	  int TCID=8;
	 String actualerrormsg = login.getpasswordIDErrorMSG();
	 String expectederrormsg = Utility1.readDataFromExcel(0, 4);
	  Assert.assertEquals(actualerrormsg,expectederrormsg,"actual and expected not match TC Fail");
	  Utility1.takescreenshot(driver, TCID);
  }  
  @AfterClass
  public void closebrowser() 
  {
	  closeBrowser();
  }
}
