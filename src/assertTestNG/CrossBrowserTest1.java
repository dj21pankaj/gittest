package assertTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest1 {
	 @Test
	  public void FireFox() throws InterruptedException 
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\FireFox\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			
		  }
	 @Test
	 public void Chrome() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
	
	 }
}
