package size_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_set {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		// get default size 
		//driver.manage().window().getSize();
		System.out.println(driver.manage().window().getSize());
		Dimension defaultsize = driver.manage().window().getSize();// refrence variable is dimention
		
	// create the dimention class and d is object of class and accept the width and height
		Dimension d=new Dimension(850,400);
	// set size using object of dimention class	
		
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		
		
		driver.manage().window().minimize();
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize()); 
		
		
		
		
		
	}

}
