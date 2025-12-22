package org.def;

import java.util.List;
import java.util.Map;

import org.helper.UtilClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDef extends UtilClass {
	
	@Given("To user launch edge browser and pass amazon url")
	public void toUserLaunchEdgeBrowserAndPassAmazonUrl() {
	    edgeBrowser();
	    passUrl("https://www.amazon.in/");
	}

	@Then("To user click search box button")
	public void toUserClickSearchBoxButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	@When("To user enter product in search box")
	public void toUserEnterProductInSearchBox(io.cucumber.datatable.DataTable d) {
	   
		List<Map<String, String>> l = d.asMaps();
//		Map<String, String> m = l.get(1);
//		String value = m.get("moto");
		String value = l.get(1).get("iphone");
		
	    WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchTextBox.sendKeys(value);
	    
	}
}
