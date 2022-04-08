package assertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNullNG {
  @Test
  public void AssertNotNull() 
 {
	  String str="ABC";
		 
		 Assert.assertNotNull(str,"Value is null");
		 Reporter.log(" AssertNotNull is running", true);

  }
  
}
