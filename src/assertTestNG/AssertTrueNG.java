package assertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueNG {
  @Test
  public void AssertTrue() 
  {
	  boolean result=false;
	  Assert.assertTrue(result, "Result is False");
  }
}
