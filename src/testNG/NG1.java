package testNG;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NG1 {
  @Test
  public void MyMethod1() {
	  System.out.println("TestNG");
	  Reporter.log("Pankaj",true);
  }
  @Test
  public void MyMethod2() {
	  System.out.println("TestNG1");
  }
  @Test
  public void MyMethod3() {
	  System.out.println("TestNG2");
  }
  @Test
  public void MyMethod4() {
	  System.out.println("TestNG3");
  }
  
  
}
