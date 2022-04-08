package handlingmultipleeElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingMultiCheakBox {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> allcheakbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Total no of cheakboxes "+allcheakbox.size());
		 
		for(WebElement w:allcheakbox) 
		{
			Thread.sleep(1500);
			w.click();
		}
		
		for(WebElement w:allcheakbox)
		{
			Thread.sleep(1500);
			w.click();
		}
		
		Thread.sleep(1500);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
