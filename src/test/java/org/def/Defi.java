package org.def;

import java.util.List;

import org.element.LoginPage;
import org.helper.UtilClass;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defi extends UtilClass {
	@Given("To user launch edge browser and enter  url")
	public void toUserLaunchEdgeBrowserAndEnterUrl() {
		edgeBrowser();
		passUrl("https://www.facebook.com/");
	}
	@Given("To user launch edge browser and pass valid url")
	public void to_user_launch_edge_browser_and_pass_valid_url() {
	    	chromeBrowser();
	    	passUrl("https://www.facebook.com/");
	}
	
	@When("To user enter valid username and valid password")
	public void toUserEnterValidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
	    			List<List<String>> list = d.asLists();
//	    			List<String> row = l.get(1);
//	    			String username = row.get(2);
	    			String username = list.get(1).get(2);
	    			
	    			List<String> row = list.get(2);
	    			String password = row.get(1);
	    			LoginPage l= new LoginPage();
	    			textpass(l.getUsername(), username);
	    			Assert.assertTrue("To false",false);
	    			textpass(l.getPassword(), password);
	}
	
	
	@Then("To user click login button")
	public void toUserClickLoginButton() {
		LoginPage l= new LoginPage();
		elementClick(l.getLoginBtn());
	//	passUrl("https://www.facebook.com/");
		
		
	}
	

	@When("To user enter valid username and password")
	public void toUserEnterValidUsernameAndPassword() {
		LoginPage l= new LoginPage();
		textpass(l.getUsername(), "siva");
		textpass(l.getPassword(), "siva123");
	}
		
	





	

}
