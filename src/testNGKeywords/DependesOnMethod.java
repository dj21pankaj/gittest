package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependesOnMethod {
	 @Test(dependsOnMethods = {"c"})// a depends on c so after c excution then a is excuted.
	  public void a() 
	  {
		 Reporter.log("Running a method",true); 
	  }
	 
	  @Test
	  public void c() 
	  {
		  Reporter.log("Running c method",true); 
	  }
	 
	  @Test
	  public void b() 
	  {
		  Reporter.log("Running b method",true); 
	  }
}
