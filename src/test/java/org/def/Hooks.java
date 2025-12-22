package org.def;

import org.helper.UtilClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends UtilClass{
	
	
	@Before(order = 1)
	public void beforeTest1() {
		
	}
	
	@Before(order = 2)
	public void beforeTest2() {
		System.out.println("Before=2,order=2");
	}
	
	@After(order = 3)
	public void  afterTest1( Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] src = t.getScreenshotAs(OutputType.BYTES);
			s.embed(src, "image/png");
		}
		
	}
	
	
	
	@After(order = 1)
	public void  afterTest2() {
		closeEntireBrowser();
		dateAndTime();
	}

	
	
	

	
	

	
	
	
	
	
	

}
