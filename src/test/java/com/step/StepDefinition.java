package com.step;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helpers.File_Reader_Manager;
import com.pom.Login_Module;
import com.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = TestRunner.driver;
	Login_Module l = new Login_Module(driver);

	@Given("^user launches the url$")
	public void user_launches_the_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		getUrl("https://www.flipkart.com/");

	}

	@When("^User clicks signin button on amazon home page$")
	public void user_clicks_signin_button_on_amazon_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(l.getSignInButton());
	}

	@When("^user enters username in username field$")
	public void user_enters_username_in_username_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		inputValue(l.getUsername(), File_Reader_Manager.getInstance().getInstanceCR().getUsername());
	}

	@When("^User ebters password in password field$")
	public void user_ebters_password_in_password_field() throws Throwable {
		// Write code here that fil the phrase above into concrete actions
		inputValue(l.getPassword(), File_Reader_Manager.getInstance().getInstanceCR().getPassword());
	}

	@Then("^user clicks login button and it's navigate to next page$")
	public void user_clicks_login_button_and_it_s_navigate_to_next_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(l.getLogin());
		implicitlyWait();

	}

	@When("^user Selects the product from home page$")
	public void user_Selects_the_product_from_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		DropDownSelectValues(l.getProductCatogary(), "Amazon Devices");
	}

	@When("^users click search button and it will give products relatedly$")
	public void users_click_search_button_and_it_will_give_products_relatedly() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(l.getSearchProduct());
	}

//	@When("^user selects the products catogary$")
//	public void user_selects_the_products_catogary() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//	
//	}

	@When("^user select the product(\\d+)$")
	public void user_select_the_product(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(l.getProduct1());
		clickOnElement(l.getAddCart());
	}

	@When("^user clicks add to cart button in product page$")
	public void user_clicks_add_to_cart_button_in_product_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(l.getAddCart());
	}

	@Then("^user clicks Add to cart option from home page$")
	public void user_clicks_Add_to_cart_option_from_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(l.getAddToCartHome());

	}

	@Then("^user validates the products subtotal$")
	public void user_validates_the_products_subtotal() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Asserttion(l.getSubtotal());
	}

}
