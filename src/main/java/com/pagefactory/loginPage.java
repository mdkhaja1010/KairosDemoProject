package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class loginPage extends BaseClass{
	WebDriver driver;
	public  loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
	}
	@FindBy(id="user-name")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginButton;
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement pagetitle;
	
	public void enterUserName()
	{
		utillfunnctions.sendText(userName, userName1);
		log.info("user name is entered");
	  //userName.sendKeys("standard_user");
	}
	public void enterPassword() {
		 utillfunnctions.sendText(password, password1);
		 log.info("password is entered");
		//password.sendKeys("secret_sauce");
	}
	public void clkLoginButton() {
		utillfunnctions.ClickOnElement(loginButton);
		log.info("sign in button clicked");
		//loginButton.click();
	}
	public void titleValidations() {
		String title =validations.getText(pagetitle);
		validations.assertionEquals(title, "Swag Labs");
		log.info("Title matched");
		
	}

}
