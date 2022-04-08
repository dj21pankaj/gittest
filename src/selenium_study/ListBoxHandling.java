 package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
	//	1.	Identify list box to be handled and store it in reference variable
		WebElement ListBox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
	//	2.	Create an object of Select class which will accept WebElement as argument
		
		Select Z=new Select(ListBox);
		

   //     3.By using one of the select class methods we can select values form list box like 
		 
		Z.selectByVisibleText("Option2");//by text using this method
		Thread.sleep(2000);
		Z.selectByValue("option1");//by value using
		Thread.sleep(2000);
		Z.selectByIndex(3);
		
		System.out.println("Is Multiple state "+Z.isMultiple());
		
		
		
		

		
		
		
	}

}
