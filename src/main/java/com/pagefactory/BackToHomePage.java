package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BackToHomePage extends BaseClass {
	WebDriver driver;
	
	public BackToHomePage(WebDriver driver) {
		this.driver=driver;
   	 PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="#back-to-products")
	private WebElement backbutton;
	
	public void clkbackHomeButton() {
		utillfunnctions.ClickOnElement(backbutton);
		//backbutton.click();
		log.info("backbutton clicked");
	}
	

}
