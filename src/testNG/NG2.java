package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NG2 {
  @Test
  public void MyMethode () {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Reporter.log("www.facebook.com",true);
  }
  @Test
  public void MyMethode1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Reporter.log("www.vctcpune.com",true);
		
  }
  @Test
  public void MyMethode2() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Reporter.log("www.w3schools.com",true);
		
  }
  
  @Test
  public void MyMethode3() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Reporter.log("www.discoveryplus.in",true);
  }
}
