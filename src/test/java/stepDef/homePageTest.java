package stepDef;

import demo.base.DriverFactory;
import demo.pages.homePage;
import demo.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homePageTest {
	
	private loginPage login = new loginPage(DriverFactory.getDriver());
	private homePage home;

	@Given("enter valid username {string} and password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
	    home = login.setCredentials(string, string2);
	  
	}

	@Given("click threeLine button")
	public void click_three_line_button() {
	    home.clickThreeLine();
	}
	@When("Click AboutUs button")
	public void click_about_us_button() {
	    home.clickAboutUs();
	}
	@Then("check the page is navigating to aboutus page and return back to product page")
	public void check_the_page_is_navigating_to_aboutus_page_and_return_back_to_product_page() {
	    home.NavigatebackToProductPage();
	}

	@Then("Select the highest price item")
	public void select_the_highest_price_item() throws InterruptedException {
	    home.selectHighestPrice();
	}
	

	@Then("Click shopping cart link")
	public void click_shopping_cart_link() {
		home.clickShoppingCartLink();
	}
	@Then("Click checkout")
	public void click_checkout() throws InterruptedException {
	    home.Checkout();
	}
	@Then("EnterDetails")
	public void enter_details() {
	   home.details();
	}
	@Then("Validate Price and Click Finish")
	public void validate_price_and_click_finish() throws InterruptedException {
	    home.Finish();
	}









}
