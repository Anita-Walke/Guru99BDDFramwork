package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilLayer.Wait;

public class LoginPage extends BaseClass{
	@FindBy(name="firstName")
	 WebElement fname;

public LoginPage ()
{
	PageFactory.initElements(driver, this);
}

public void EneterFname(String Fname)
{
Wait.sendKeys(fname, Fname);

}
}
