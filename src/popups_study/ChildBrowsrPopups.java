
package popups_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsrPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String MainPageWindowID = driver.getWindowHandle();;//Main page window id only
		System.out.println("Main Page window ID "+MainPageWindowID);
		driver.findElement(By.xpath("//Input[@name='NewWindow']")).click();// opening child browser popup
//      we got multiple window opening
		Set<String> AllWindowID = driver.getWindowHandles();//creat all window id
		System.out.println("All Window ID "+AllWindowID);//Got two id main and child page
		  
		Iterator<String> IT=AllWindowID.iterator();//iterator=min-1 on point locate
		 String mainpageID = IT.next();//0 position means main page 
		 String childpageID1 = IT.next();//1 st postion means child page positin
		
		// switch selenium focus on childe page
		 
		 driver.switchTo().window(childpageID1);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("master");
		 Thread.sleep(2000);
		 driver.close();
		 // switch selenium page to main page
		 driver.switchTo().window(mainpageID);
		 
		 driver.findElement(By.xpath("//input[@name='home']")).click();
		 Thread.sleep(2000);
		 driver.close();
		
		
		
		
		
		
		
		
	}

}
