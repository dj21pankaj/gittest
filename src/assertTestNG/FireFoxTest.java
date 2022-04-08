package assertTestNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void FireFox() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\FireFox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	  
	  
	  
  }
}
