package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAssn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    Thread.sleep(2000);
	//    driver.findElement(By.xpath("//select[@id='Day']"));
	    WebElement DropBox1 = driver.findElement(By.xpath("//select[@id='day']"));
	    Thread.sleep(2000);
	    Select A=new Select(DropBox1);
	    Thread.sleep(2000);
	    A.selectByValue("21");

	//    driver.findElement(By.xpath("//select[@id='month']"));
	    WebElement DropBox2 = driver.findElement(By.xpath("//select[@id='month']"));
	    Select B=new Select(DropBox2);
	    B.selectByVisibleText("Nov");
	    
	//    driver.findElement(By.xpath("//select[@id='year']"));
	    WebElement DropBox3 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select C=new Select(DropBox3);
	    C.selectByIndex(28);
	    
	}
	

}
