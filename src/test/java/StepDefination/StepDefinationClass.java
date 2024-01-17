package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationClass extends BaseClass{
	
	public static LoginPage login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   BaseClass.initialization();
	}
	@When("user enter valid firstname,lastname and Phone")
	public void user_enter_valid_firstname_lastname_and_phone() {
	   
		LoginPage login = new LoginPage();
		login.enterFnameLnameAndPhone("Monika");
		
	}


}
