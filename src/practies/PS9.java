package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PS9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	    System.out.println("text is "+text);
	    Thread.sleep(2000);
	    
	    WebElement sendtext = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	    sendtext.sendKeys("pankaj");
	    Thread.sleep(1000);
	    sendtext.clear();
	    
	    WebElement cheakBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	    boolean result = cheakBox.isSelected();
	    boolean result2=cheakBox.isEnabled();
	    System.out.println("cheakbox status "+result);
	    System.out.println("status is enabled "+result2);
	    Thread.sleep(1000);
	    cheakBox.click();
	    boolean result1 = cheakBox.isSelected();
	    System.out.println("cheakbox status "+result1);
	    
	    WebElement disply = driver.findElement(By.xpath("//input[@name='show-hide']"));
	    boolean dis = disply.isDisplayed();
	    System.out.println("displyed stauts "+dis);
	    
	    driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	    boolean dis1 = disply.isDisplayed();
	    System.out.println("displyed stauts "+dis1);
	
	
	
	
	
	
	
	
	
	}

}
