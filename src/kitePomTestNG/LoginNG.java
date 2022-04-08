package kitePomTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginNG {

	   @FindBy(xpath="//input[@id='userid']") private WebElement userID;
	   @FindBy(xpath="//input[@id='password']") private WebElement Password;
	   @FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	   
	   public LoginNG(WebDriver driver) 
	   {
		   PageFactory.initElements(driver,this);
	   }
	   
	   public void senduserid(String uid) 
	   {
		   userID.sendKeys(uid);
	   }
	   
	   public void sendpassword(String pass) {
		   Password.sendKeys(pass);
	   }
	   
	   public void clickloginButton() {
		   LoginButton.click();
	   }
	   

}
