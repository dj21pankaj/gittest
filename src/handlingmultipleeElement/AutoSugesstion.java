package handlingmultipleeElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugesstion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		System.out.println(alloptions.size()); 
		
		for(WebElement w:alloptions)
		{
			System.out.println(w.getText()); 
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
