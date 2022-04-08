package kiteAppTestClassesADV;

import org.testng.annotations.Test;

import baseClasses.BaseClass1;
import kitePOMClassesADV.LoginNG;
import utility.Utility1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;

public class kiteuserIDErrorMSGValidation extends BaseClass1
{ 
	LoginNG login; 
    @BeforeClass
    public void lunchbrowser() 
    
	 {
    	lunchBrowser();
    	login=new LoginNG(driver);
    	
	  }
	@BeforeMethod
	 public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	 
	 {
		login.sendpassword(Utility1.readDataFromExcel(0, 1));
		login.clickloginButton();
		
	  }

  @Test
  public void validateuserIDErrorMsg() throws EncryptedDocumentException, IOException 
  {
	  int TCID=007;
	  String actualerrormsg = login.getuserIDErrorMSG();
	  String expectederrormsg = Utility1.readDataFromExcel(0, 3);
	  Assert.assertEquals(actualerrormsg, expectederrormsg,"actual and expected not equal TC Fail");
	  Utility1.takescreenshot(driver, TCID);
  }
 
  @AfterClass
  public void closebrowser() 
  {
	  closeBrowser();
  }

 

  

}
