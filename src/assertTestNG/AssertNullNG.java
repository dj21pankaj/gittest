package assertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullNG {
	@Test
	  public void AssertNull() 
	  
	  {	
		 String str="P";
		 
		 Assert.assertNull(str,"Value is not null");
		 Reporter.log("TC5 is running", true);
	  
	   String strs="ABC";
	 
	    Assert.assertNotNull(strs,"Value is null");
	    Reporter.log("TC6 is running", true);
}
}