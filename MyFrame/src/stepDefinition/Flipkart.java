package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mani.test.FlipkartScripts;


public class Flipkart{
	FlipkartScripts run = new FlipkartScripts();
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		run.launch_the_browser();
	}

	@When("^Navigate to  a website$")
	public void navigate_to_a_website() throws Throwable {
	   run.navigate_to_a_website();
	   
	}

	@Then("^validate the website$")
	public void validate_the_website() throws Throwable {
	   run.validate_the_website();

	}

	
	public static void main(String[] args) {
		
	}

}
