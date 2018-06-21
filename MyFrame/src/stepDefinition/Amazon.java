package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mani.test.AmazonScript;

public class Amazon {
	AmazonScript run = new AmazonScript();
	@When("^Navigate to Amazon Website$")
	public void navigate_to_Amazon_Website() throws Throwable {
	    run.navigate_to_Amazon_Website();
	    
	}

	@Then("^validate the Amazon website$")
	public void validate_the_Amazon_website() throws Throwable {
		run.validate_the_Amazon_website();
	   
	}

}
