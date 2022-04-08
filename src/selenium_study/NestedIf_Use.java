package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIf_Use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		WebElement ParentFrame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String frame1=ParentFrame.getText();
		System.out.println(frame1);
		Thread.sleep(2000);
		
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
	
		WebElement ChildFrame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String child=ChildFrame.getText();
		System.out.println(child);
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
