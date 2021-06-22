package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
  /*
	@Given("^User is on NetBanking landing page$")
  public void user_is_on_netbanking_lang_page() throws Throwable
  {
	  System.out.println("Step 1: You are on NetBanking Login Page");
  }

  @When("^User Logs into application with username and password$") 
  public void user_logs_into_application_with_username_and_password() throws Throwable
  {
	  System.out.println("User enters login credentials and clicks on Login button");	  
  }

  @Then("^Home page is populated$")
  public void home_page_is_populated() throws Throwable 
  {
	  System.out.println("Login is Successful and home page is displayed");
  }

  @And("^Cards are displayed$")
  public void cards_are_displayed() throws Throwable 
  {
	  System.out.println("All Credit Cards are displayed");
  }
*/
	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Step 1: You are on NetBanking Login Page");
		//throw new PendingException();
    }

    @When("^User Logs into application with username and password$")
    public void user_logs_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Step 2: User enters login credentials and clicks on Login button");	 
        //throw new PendingException();
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Step 3: Login is Successful and home page is displayed");
        //throw new PendingException();
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Step 4: All Credit Cards are displayed");
        //throw new PendingException();
    }

	
}
