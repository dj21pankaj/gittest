package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhawithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='userid']"));
		userId.sendKeys("SB2040");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Pank@7675");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys("767574");
		
		WebElement countinousbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		countinousbutton.click();
		
		Thread.sleep(1000);
		WebElement userId1 = driver.findElement(By.xpath("//span[@class='user-id']"));
        String actualtext = userId1.getText();
      
        
        String expectedtext = "SB2040";
        
        if(actualtext.equals(expectedtext))
        {
        	System.out.println("Maching right TC Pass");
        }
        else
        {
        	System.out.println("Maching not found TC Fail");
        	
        }
        
        userId1.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@target='_self']")).click();
        Thread.sleep(1000);
        driver.close();
		
		
		
		
		
	}

}
