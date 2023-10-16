package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LogoutPage extends BaseClass {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubtn;
	@FindBy(xpath="//nav[@class='bm-item-list']/./a[3]")
	private WebElement logoutbtn;
	public void clkMenubtn() {
		utillfunnctions.explicitWaitToVisibilityOfElement(10, menubtn);
		utillfunnctions.ClickOnElement(menubtn);
		log.info("menu button opened");
		//menubtn.click();
	}
	public void clkLogoutbtn() {
		utillfunnctions.explicitWaitToVisibilityOfElement(10, logoutbtn);
		utillfunnctions.ClickOnElement(logoutbtn);
		log.info("logout button clicked");
		//logoutbtn.click()
	}
	
	

}
