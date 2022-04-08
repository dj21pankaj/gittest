package assertTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest2 {
	@Parameters("browserName")
  @Test
  public void CrossBrowser(String browserName) throws InterruptedException {
  
       WebDriver driver=null;
       if(browserName.equals("FireFox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\FireFox\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			}
       else if(browserName.endsWith("Chrome")) 
       {
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize(); 
    	   
       }
       
       driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		driver.close();
	   
  }
}
