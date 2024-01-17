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
	
	@When("user enter valid firstname,lastname,phone,email")
	public void user_enter_valid_firstname_lastname_phone_email() {
		
	    login = new LoginPage();
	   login.enterContactInformation("monika", "adsul", "1234567894", "monika@gmail.com");
	

}
	
	@When("user enter valid Address,City,State,PostalCode and Country")
	public void user_enter_valid_address_city_state_postal_code_and_country() {
		login.enterMailingInfo("Pune", "Pune", "MH", "2315696", "INDIA");
	}
	
}