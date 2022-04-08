package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	//	driver.get("https://vctcpune.com/");//to enter url in browser or to open an application.
	//	driver.get("https://www.airtel.in/");
		
	//	driver.get("https://www.mahadiscom.in/en/home/");
	//  driver.close();//to close the current tab of the browser opened by Seleniume tool.
	//  driver.quit();//to close the all the tabs present in browser opened by Seleniume tool.
	//	driver.manage().window().maximize();
	//	Thread.sleep(2000);
	
	//	driver.get("https://www.airtel.in/");
	//	driver.manage().window().minimize();
	//	driver.navigate().back();//this method is use to open an application, move forward, backward & refresh the webpage
	//	Thread.sleep(2000);
	//	driver.navigate().forward();
	//	Thread.sleep(2000);
	//	driver.navigate().refresh();
		driver.navigate().to("https://vctcpune.com/");// using to method in navigate it is same work as get method..use( .to())
	//	System.out.println(driver.getTitle());
	//	String title=driver.getTitle();
	//	System.out.println("Title is "+title);
		
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		System.out.println("Url is this page "+url);
		
		
		
		
		
		
	
	
	
	}

}
