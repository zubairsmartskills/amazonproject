package org.def;

import java.util.List;

import org.element.LoginPage;
import org.helper.UtilClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilClass {
	


	




	




@Then("To user quit browser")
public void toUserQuitBrowser() {
		driver.close();
}


@Given("To user launch edge browser")
public void toUserLaunchEdgeBrowser() {
    	edgeBrowser();
}

@When("To user enter valid url")
public void toUserEnterValidUrl() {
	passUrl("https://www.facebook.com/");
}

@When("To user enter {string} and {string}")
public void toUserEnterAnd(String user, String pass) {
	LoginPage l= new LoginPage();
	textpass(l.getUsername(), user);
	textpass(l.getPassword(), pass);
}


@When("To user enter invalid username and invalid password")
public void toUserEnterInvalidUsernameAndInvalidPassword() {
	LoginPage l= new LoginPage();
	textpass(l.getUsername(), "asdas");
	textpass(l.getPassword(), "1as1");
}

	

	
}
