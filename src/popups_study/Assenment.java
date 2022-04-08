package popups_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assenment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String mainpageID = driver.getWindowHandle();
		System.out.println("main page id "+mainpageID);
		 
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		Set<String> AllWindowID = driver.getWindowHandles();
		System.out.println("ALLwindow ID "+AllWindowID);
		
		Iterator<String> IT=AllWindowID.iterator();
		String mainpageID1 = IT.next();
		String childpageID2 = IT.next();
		
	    driver.switchTo().window(childpageID2);
	    driver.manage().window().maximize();
	//    WebElement serach = driver.findElement(By.xpath("//span[@id='et_search_icon']"));
	//    serach.click();
	//    Thread.sleep(2000);
	//    driver.findElement(By.xpath("//input[@type='search']")).click();
	    driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	    driver.switchTo().window(mainpageID1);
	    Thread.sleep(2000);
	    driver.close();
		
	    //java.net.SocketException: Connection reset..cheak

	}

}
