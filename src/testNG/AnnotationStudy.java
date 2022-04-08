package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateuserID() 
  {
	  Reporter.log("Validate user ID",true);
  }
  @Test
  public void sampletest()
  {
	  Reporter.log(" sample test",true);
  }
  @BeforeClass
  public void lunchingbrowser() 
  {
	Reporter.log("Lunching Browser",true);   
  }
  
  @AfterClass 
            
	public void logoutbrowser()
	{
	  Reporter.log("Logout Browser",true);
  }
  @BeforeMethod
  public void loginMainpage()
  {
	  Reporter.log("Login Main page ID and Password",true);
  }
  @AfterMethod
  public void logOutApp()
  {
	  Reporter.log("Log Out App",true);
  }
}
