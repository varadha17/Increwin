package stepDef;

import demo.base.DriverFactory;
import demo.pages.loginPage;
import io.cucumber.java.en.Given;

public class loginPageTest {
	
	
	private loginPage login = new loginPage(DriverFactory.getDriver());

	@Given("enter username {string} and password {string}")
	public void enter_username_and_password(String string, String string2) {
		login.getTitleOfPage();
	    login.setCredentials(string, string2);
	}




}
