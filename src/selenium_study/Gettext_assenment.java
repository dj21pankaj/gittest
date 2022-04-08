package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_assenment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
		WebElement Cheaktext = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String Actultext = Cheaktext.getText();
		System.out.println("text is "+Actultext);
	    String Expected = "Facebook helps you connect and share with the people in your life.";
		 if(Actultext.equals(Expected)) {
			 System.out.println("text is maching tc is passed");
		 }
		 else {
			 System.out.println("text not maching tc is not passed");
		 }
		
		
		
		
		
	}

}
