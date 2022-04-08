package size_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positions_set {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		//get defult position
		
	//	driver.manage().window().getPosition();
		System.out.println(driver.manage().window().getPosition());
		Point defultposition = driver.manage().window().getPosition();
		
		//to change position creat object of point class it accept the x and y co ordinate
		Point p=new Point(20,40);
		
		Thread.sleep(2000);
	// use set position which will accept the point class object	
		
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
	}

}
