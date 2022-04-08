package groupTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupNG1 {
	 @Test(groups="sanity")
	  public void TC1() 
	  {
		  Reporter.log("Running TC1 ",true);
	  }
	  @Test(groups="regression")// 2nd group..also call indivisual
	  public void TC2() 
	  {
		  Reporter.log("Running TC2 ",true);
	  }
	  @Test(groups="sanity")// 1st group..also call indivisual
	  public void TC3() 
	  {
		  Reporter.log("Running TC3 ",true);
	  }
	  @Test(groups={"regression","sanity"})// combning two groups toghether
	  public void TC4() 
	  {
		  Reporter.log("Running TC4 ",true);
	  }
	  @Test(groups="regression")
	  public void TC5() 
	  {
		  Reporter.log("Running TC5 ",true);
	  }
}
