package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy1 //@test methodes write any sequence but run in alphabetical manner
                              // @test methodes is equal to no of methodes
{
	
	@Test
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
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
