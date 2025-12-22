package org.element;

import org.helper.UtilClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilClass{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({
		@FindBy(name="email"),
		@FindBy(xpath = "//input[@placeholder='Email address or phone number']")
	})
	private WebElement username;

	@CacheLookup
	@FindAll({
		@FindBy(name="pass"),
		@FindBy(xpath="//input[@type='passwod']")
	})
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

}
