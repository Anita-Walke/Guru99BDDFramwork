package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationClass extends BaseClass{
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   BaseClass.initialization();
	}
	@When("user enter valid firstname,lastname")
	public void user_enter_valid_firstname_lastname() {
	   LoginPage login=new LoginPage();
	   login.EneterFname("Tajuddin");
	    
	}
	

}
