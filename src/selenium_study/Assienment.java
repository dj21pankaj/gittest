package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assienment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pankaj21@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pankaj007");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	//     driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
	 //    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
	
	
	}
}
