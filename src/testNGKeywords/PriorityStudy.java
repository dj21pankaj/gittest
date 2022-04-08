package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy //priority set by - to + value.  - is greater
{
	@Test (priority=1,invocationCount = 2)// combing two keyword together
	  public void a() 
	  {
		 Reporter.log("Running a method",true); 
	  }
	 
	  @Test
	  public void c() 
	  {
		  Reporter.log("Running c method",true); 
	  }
	 
	  @Test(priority=-1)
	  public void b() 
	  {
		  Reporter.log("Running b method",true); 
	  }
}
