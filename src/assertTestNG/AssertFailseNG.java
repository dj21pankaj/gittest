package assertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailseNG {
	 @Test
	  public void AssertFails() 
	  {
		  boolean result=false;
		  Assert.assertFalse(result, "Result is True");
	  }
}
