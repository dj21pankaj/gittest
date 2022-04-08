package kiteAppTestClassesADV;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseClassUsingProperteFile;
import kitePOMClassesADV.LoginNG;
import kitePOMClassesADV.MainNG;
import kitePOMClassesADV.PinNG;
import utility.UtilityUsingProperteFile;

public class KiteAppUserValidationUsingProperteFile extends BaseClassUsingProperteFile  {
    LoginNG login;
    PinNG pin;
    MainNG main;
    int TCID=13;
	@BeforeClass
  public void lunchbrowser() throws IOException 
  {
	  lunchBrowser();
	  login=new LoginNG(driver);
	  
	  pin=new PinNG(driver);
	  main=new MainNG(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
	@BeforeMethod
	public void logintokiteapp() throws IOException 
	{
		login.senduserid(UtilityUsingProperteFile.getDataFromProperteFile("UN"));
		login.sendpassword(UtilityUsingProperteFile.getDataFromProperteFile("PWD"));
		login.clickloginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendpin(UtilityUsingProperteFile.getDataFromProperteFile("PIN"));
		pin.clickCountiButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
	
	@Test
	public void validateuserid() throws IOException 
	{
		
		String expecteduserID = UtilityUsingProperteFile.getDataFromProperteFile("UN");
		String actualuserID = main.getactualuserid();
		Assert.fail();
		Assert.assertEquals(actualuserID, expecteduserID,"Actual and Expect not Match TC Fail");
		//UtilityUsingProperteFile.takescreenshot(driver, TCID);
	}
	
	
	
	  @AfterMethod
	    public void logoutKiteApp(ITestResult result) throws InterruptedException, IOException 
	    {
		  if(result.getStatus()==result.FAILURE) 
		  {
			  UtilityUsingProperteFile.takescreenshot(driver, TCID);
		  }
		  else
		  {
			  Reporter.log("TC is PASS",true);
		  }
	    	main.clickLogoutButton();
	    	Reporter.log("logout Kite App",true);
	   //only fail condition take screenshoot 	
	    }
		 @AfterClass
		 public void closingBrowser() 
		 {
			 closeBrowser();
			 Reporter.log("close Browser",true);
		 }
	
	
	
	
	
	
	
}

