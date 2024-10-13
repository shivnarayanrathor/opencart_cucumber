package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);	
		
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[normalize-space()='Address Book']")
	WebElement lnkAddressBook;
	
	@FindBy(xpath="//a[normalize-space()='New Address']")
	WebElement btnNewAddress;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
    public boolean isMyAccountPageExists()
    {
    	try
    	{
    		return (msgHeading.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    }
    
    public void clickAddressBook()
    {
    	lnkAddressBook.click();
    }
    
    public void clickNewAddress()
    {
    	btnNewAddress.click();
    }
    public void clickLogout()
    {
       lnkLogout.click();
    }
    
}
