package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDisplyedUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@name='show-hide']"));
		WebElement DropBox = driver.findElement(By.xpath("//input[@name='show-hide']"));
		boolean result = DropBox.isDisplayed();
		System.out.println("Drop box is displyed result "+result);
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		WebElement Result1 = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		
		Result1.click();
		boolean Result= DropBox.isDisplayed();
		System.out.println("Drop box is displyed result "+Result);
		
	
	}

}
