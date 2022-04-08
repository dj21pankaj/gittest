package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMethods {

	    ;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	//	driver.findElement(By.id("email")).sendKeys("pankaj");
		Thread.sleep(2000);
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("pankaj");
	//   Exception occur..>Compound class names not permitted	
		Thread.sleep(2000);
	//	driver.findElement(By.name("email")).sendKeys("pankaj");
		 
		WebElement  username=driver.findElement(By.id("email"));
		username.sendKeys("pankaj");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("pank");
		
		driver.findElement(By.name("pass")).sendKeys("pass");
		
	//	driver.findElement(By.name("login")).click();
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
		
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
	//	driver.findElement(By.partialLinkText("password?")).click();
		driver.findElement(By.xpath("(//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy'])")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
