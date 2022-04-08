package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		WebElement Option1CheakBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//     	boolean Result1 = false;
     	boolean Result1 = Option1CheakBox.isSelected();
		System.out.println("cheak box result "+Result1);
		if(Result1)
		{
		    boolean Result11 = Option1CheakBox.isSelected();
		    System.out.println("cheak box result "+Result11);
		}
		else {
			System.out.println("cheak box is not selected then selecting cheak box now");
			Option1CheakBox.click();
			Thread.sleep(1000);
			System.out.println("Check box selected");
		    boolean Result2=Option1CheakBox.isSelected();
	    	System.out.println("Updated cheakbox selected status is "+Result2);
			
		}
		
		
		
		
	}}


