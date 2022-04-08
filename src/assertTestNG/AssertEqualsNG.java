package assertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNG {
  @Test
  public void AssertEquals() 
  {
	  String name="VCTC";
	  String name1="VCTC";
	  
	  Assert.assertEquals(name, name1,"String not match");
	  
	  
	  
	  
  }
}
