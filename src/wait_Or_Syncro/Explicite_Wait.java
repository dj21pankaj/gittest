package wait_Or_Syncro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite_Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
//static wait		
		
//		Thread.sleep(7000);
//Implicit wait..wait for hole webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9096828075");
		WebElement getOTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
//Explicite wait..wait for single element
		
	//	WebDriverWait w=new WebDriverWait (driver,Duration.ofMillis(1000));
	//	w.until(ExpectedConditions.visibilityOf(getOTPButton));
	//	getOTPButton.click();

//Fluent wait..wait for single element
		
		        Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(1000))
				.pollingEvery(Duration.ofMillis(5))
				.ignoring(Exception.class);
		      getOTPButton.click();  
		
		
	}

}
