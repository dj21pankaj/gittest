package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners (listener.Listener1.class)
// get comment bcoz u run this class in XML format..uncomment when u run in class level
public class Testing {
  @Test
  public void a() 
  {
	  Reporter.log("TC Case a is running",true);
  }
  @Test
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("TC Case b is running",true);
  }
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  Reporter.log("TC Case c is running",true);
  }
}
