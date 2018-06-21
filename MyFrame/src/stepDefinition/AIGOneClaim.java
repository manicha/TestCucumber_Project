package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mani.test.AIGOneClaimScripts;

public class AIGOneClaim {
	AIGOneClaimScripts run = new AIGOneClaimScripts();
	
	@Given("^Launch the Chrome browser$")
	public void launch_the_Chrome_browser() throws Throwable {
	    run.launch_the_Chrome_browser();
	 
	}
	@When("^Navigate to OneClaim dashboard$")
	public void navigate_to_OneClaim_dashboard() throws Throwable {
		run.navigate_to_OneClaim_dashboard();
	   
	}

	@When("^Search Claim$")
	public void search_Claim() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Click on Link icon and click on update Feature option$")
	public void click_on_Link_icon_and_click_on_update_Feature_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Update the Feature$")
	public void update_the_Feature() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^Submit the Feature$")
	public void submit_the_Feature() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
