package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GenericSteps {

	@Given("User is on amazon application log in page")
	public void hitAmazonUrl() {
	    System.out.println("User is on amazon application log in page");
	}

	@When("user enters username {string} and password {string}")
	public void enterCredentials(String username, String password) {
	   System.out.println("user enters username and password");
	}

	@When("user search for item {string}")
	public void searchItem(String item) {
	  System.out.println("user search for item mobile");
	}
	
	@When("user added the item to cart")
	public void addToCart() {
	    System.out.println("user added the item to cart");
	}
}
