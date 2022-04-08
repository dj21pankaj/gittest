package popups_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement confirmbutton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmbutton.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);

		String textonalertpopup = alt.getText();//getting text from alert popup
		System.out.println("text on alert pop up is "+textonalertpopup);
		alt.accept();// accepting alert-->clicking on ok button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt2.sendKeys("Pankaj");
		Thread.sleep(2000);
		alt2.dismiss();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(7000);
		Alert alt3 = driver.switchTo().alert();
		alt3.accept();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
	}

}
