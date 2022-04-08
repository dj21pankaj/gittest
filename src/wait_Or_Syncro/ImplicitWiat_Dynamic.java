package wait_Or_Syncro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWiat_Dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
	// Implicit wait for whole Webpage applicable	
	//you are waiting for 100sec.. page loaded in 20 sec.. once page loaded.. release timeout(80sec)..time consume by 80sec
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
   // after this wait next action perform
	}

}
