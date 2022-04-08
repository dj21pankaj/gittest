package groupTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailXMLNG {
	@Test(timeOut = 100)
	  public void TC1() throws InterruptedException 
	  {
		 Thread.sleep(60);
		  Reporter.log("Running TC1 ",true);
	  }
	  @Test
	  public void TC2() 
	  {
		  Reporter.log("Running TC2 ",true);
		//  Assert.fail();
	  }
	  @Test
	  public void TC3() 
	  {
		  Reporter.log("Running TC3 ",true);
	  }
	  @Test
	  public void TC4() 
	  {
		  Reporter.log("Running TC4 ",true);
	  }
	  @Test
	  public void TC5() 
	  {
		  Reporter.log("Running TC5 ",true);
	  }
}
