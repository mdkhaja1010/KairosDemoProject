package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FinishPage extends BaseClass {
	WebDriver driver;
	public FinishPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[text()='Finish']")
	 private WebElement finish;
	
	public void clkFinishBtn() {
		utillfunnctions.ClickOnElement(finish);
		log.info("order finished");
		
		//finish.click();
	}
}
