package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IncovationCount {
  @Test(invocationCount = 2)
  public void a() 
  {
	 Reporter.log("Running a method",true); 
  }
 
  @BeforeMethod
  public void c() 
  {
	  Reporter.log("Running c method",true); 
  }
 
  @AfterMethod
  public void b() 
  {
	  Reporter.log("Running b method",true); 
  }
}
