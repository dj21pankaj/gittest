package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PS10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[@class='button-wrap'])[4]")).click();
		 Thread.sleep(2000);
		 driver.switchTo().frame("interactive is-tabbed-standard-height");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//h4[@class='output-label']")).click();

	}

}
