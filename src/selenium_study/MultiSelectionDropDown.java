package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
	//	driver.findElement(By.xpath("//select[@id='cars']"));
		WebElement DropBox = driver.findElement(By.xpath("//select[@id='cars']"));
		Select S=new Select(DropBox);
		S.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		S.selectByValue("opel");
		Thread.sleep(2000);
		S.selectByIndex(3);
		Thread.sleep(2000);
		
		S.deselectAll();
		
		}

}
