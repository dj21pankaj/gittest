package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM

{
      @FindBy(xpath="//input[@id='userid']") private WebElement userID;
      @FindBy(xpath="//input[@id='password']") private WebElement Password;
      @FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
      
      public LoginPagePOM(WebDriver driver)
      {
    	  PageFactory.initElements(driver,this);
      }
      
   


	public void senduserid() {
    	  userID.sendKeys("SB2040");
      }
      
      public void sendpassword() {
    	  Password.sendKeys("Pank@7675");
      }
	
	  public void clickloginbutton() {
		  LoginButton.click();
	  }
	
	
	
	
	
	
}
