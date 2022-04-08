package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
		WebElement  WebEle=driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	   String Actultext = WebEle.getText();
	   System.out.println("text is "+Actultext);
	   String Expectedtext="Welcome To Practice Page";
	   
	   if(Actultext.equals(Expectedtext))
	   {
		   System.out.println("text is maching,tc is passed");
	   }
	   else {
		   System.out.println("text is not maching,tc is failed");
	   }
	   
	   }

}
