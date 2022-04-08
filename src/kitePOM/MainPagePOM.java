package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPagePOM {
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;
	
	public MainPagePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void validateUserID() {
		String actualID = userID.getText();
		String expectedID = "SB2040";
		
		if(actualID.equals(expectedID))
		{
			System.out.println("Maching right TC Pass");
		}
		else{
			System.out.println("Maching not found TC Fail");
		}
	}
	
	public void clickLogoutButton() throws InterruptedException {
		userID.click();
		Thread.sleep(1000);
		LogOutButton.click();
		
		
	}

}
