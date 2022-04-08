package assertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFailNG {
	@Test
	  public void FailNG() 
	  
	  {	
		 Reporter.log("Assert fail check", true);
		 Assert.fail();
		 Reporter.log("FailNG is running", true);
		 
	  }

}
