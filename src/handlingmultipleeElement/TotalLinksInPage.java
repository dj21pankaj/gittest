package handlingmultipleeElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 List<WebElement> totallink = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link in page "+totallink.size());
		
		for(WebElement w:totallink)
		{
			System.out.println(w.getText());
		}
		
		Thread.sleep(2000);
		driver.close();


	}

}
