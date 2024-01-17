package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilLayer.HandleDropDown;
import UtilLayer.Wait;

public class LoginPage extends BaseClass{
	
	@FindBy(name="firstName")
	 WebElement fname;
	
	@FindBy(name="lastName")
	 WebElement lname;
	
	@FindBy(name="phone")
	 WebElement phone;
	
	@FindBy(name="userName")
	 WebElement email;
	
	@FindBy(name="address1")
	 WebElement add;

	@FindBy(name="city")
	 WebElement city;

	@FindBy(name="state")
	 WebElement state;

	@FindBy(name="postalCode")
	 WebElement pcode;

	@FindBy(name="country")
	 WebElement country;

	
	
	
public LoginPage ()
{
	PageFactory.initElements(driver, this);
}

public void enterContactInformation(String Fname,String Lname,String Phone,String Email)
{
Wait.sendKeys(fname, Fname);
Wait.sendKeys(lname, Lname);
Wait.sendKeys(phone, Phone);
Wait.sendKeys(email, Email);

}

public void enterMailingInfo(String Add,String City,String State,String Pcode ,String Country)
{
  Wait.sendKeys(add,Add);
  Wait.sendKeys(city,City);

  Wait.sendKeys(state,State);
   Wait.sendKeys(pcode,Pcode);

   HandleDropDown.selectByVisibleText(country,Country);

}
}
