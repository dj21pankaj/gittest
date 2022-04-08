package assertTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	  public void AssertNull() 
	  
	  {	
		 String str="P";
		 
		 Assert.assertNull(str,"Value is not null");
		 Reporter.log("TC5 is running", true);
	  
	   String strs="ABC";
	 
	    Assert.assertNotNull(strs,"Value is null");
	    Reporter.log("TC6 is running", true);
}// IN Hard Assert In one test case in that any methode is failed then after any methode not excute
	//next any methode skip not running..but another test case running..
	
	@Test
	  public void AssertNotEquals() 
	  {
		  String name="VCTC";
		  String name1="VCTC1";
		  
		  Assert.assertNotEquals(name, name1,"String is match");
		  
		  
		  
		  
	  }
	
	
	
	
	
}
