package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
	 @Test
	  public void a() 
	  {
		 Reporter.log("Running a method",true); 
	  }
	 
	  @Test(enabled =false)
	  public void c() 
	  {
		  Reporter.log("Running c method",true); 
	  }
	 
	  @Test
	  public void b() 
	  {
		  Reporter.log("Running b method",true); 
	  }
}
