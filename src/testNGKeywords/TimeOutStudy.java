package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
	@Test
	  public void a() 
	  {
		 Reporter.log("Running a method",true); 
	  }
	 
	  @Test(timeOut = 1000)// test case fail bcoz didn't finish within the time-out 1000
	  public void c() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  Reporter.log("Running c method",true); 
	  }
	 
	  @Test
	  public void b() 
	  {
		  Reporter.log("Running b method",true); 
	  }
}
