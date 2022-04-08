package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPagePOM {
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CountinousButton;
	
	public PinPagePOM(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void enterpin() {
		PIN.sendKeys("767574");
		
	}
	
	public void clickcoutibotton() {
		CountinousButton.click();
	}
	
	
	
	

}
