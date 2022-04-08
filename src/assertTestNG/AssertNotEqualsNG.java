package assertTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualsNG {
	@Test
	  public void AssertNotEquals() 
	  {
		  String name="VCTC";
		  String name1="VCTC1";
		  
		  Assert.assertNotEquals(name, name1,"String is match");
		  
		  
		  
		  
	  }
}
