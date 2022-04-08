package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		SignInButton.click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	//	OTPButton.isEnabled();
	//	System.out.println("OTPButton.isEnabled()");
		boolean result = OTPButton.isEnabled();
	//	System.out.println("OTPButton status is "+result);
		if(result) {
			//System.out.println("Get OTP Button is enabled");
			//OTPButton.click();
			System.out.println("OTPButton status is "+result);
		}
	//	else {
	//		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9096828075");
	//		Thread.sleep(200);
	//		OTPButton.click();
	//		System.out.println("Clicked on get OTP Button");
	//	}
		
		
		
		
	}

}
