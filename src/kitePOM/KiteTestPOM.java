package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestPOM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 
		LoginPagePOM login=new LoginPagePOM(driver);
		login.senduserid();
		login.sendpassword();
		login.clickloginbutton();
		
		Thread.sleep(1000);
		
		PinPagePOM pin=new PinPagePOM(driver);
		pin.enterpin();
		pin.clickcoutibotton();
		
		Thread.sleep(1000);
		
		MainPagePOM main=new MainPagePOM(driver);
		main.validateUserID();
		main.clickLogoutButton();
		 
		driver.close();
		
		
		
		
		
	}

}
