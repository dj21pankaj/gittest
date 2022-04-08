package serialandparallelNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
// serial excution time is less campare to parallel bcoz in serial it devide into multilpe part 
//that means thread,count="5".it devide into five part.we increase that count.in serial it works faster.
//in parallel no thread count and it work parallel so more time it get as compare to serial


 
public class SerialNG1 {
	@Test
	  public void MyMethode () {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    Reporter.log("www.facebook.com",true);
}
}
