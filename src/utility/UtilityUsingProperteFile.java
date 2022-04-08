package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityUsingProperteFile 
{
	public static void takescreenshot(WebDriver driver,int TCID) throws IOException 
    {

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti=new File("C:\\Users\\Pankaj\\Desktop\\Testing\\Automation\\Screenshoot\\TC"+TCID+"Screenshoot.png");
		FileHandler.copy(source,desti);
		Reporter.log("Screenshoot taken form TC " +TCID,true);
    }
	
	public static String getDataFromProperteFile(String key) throws IOException 
	{
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("C:\\Java_Programe\\11th_Dec_Java_Programme\\MyFile.properties");
		pro.load(file);
		String value = pro.getProperty(key);
		return value;
	}
}
