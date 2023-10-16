package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ShippingAddressPage extends BaseClass{
	WebDriver driver;
	public ShippingAddressPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="input[placeholder='First Name']")
	private WebElement firstName;
	@FindBy(css="input[placeholder='Last Name']")
	private WebElement lastName;
	@FindBy(css="input[placeholder='Zip/Postal Code']")
	private WebElement zipPostal;
	@FindBy(css="input[id='continue']")
	private WebElement continueBtn;
	public void enterFirstName() {
		utillfunnctions.sendText(firstName, readexcel.readDataFromExcel("Sheet1", 1, 0));
		log.info("first name entered");
	   //firstName.sendKeys("xyz");
	}
	public void enterLastName() throws InterruptedException {
		utillfunnctions.sendText(lastName, readexcel.readDataFromExcel("Sheet1", 1, 1));
		log.info("second name entered");
		Thread.sleep(4000);
		//lastName.sendKeys("abc");
	}
	public void enterzipCode() {
		utillfunnctions.sendText(zipPostal, readexcel.readDataFromExcel("Sheet1", 1, 2));
		log.info("zip code entered");
		//zipPostal.sendKeys("500081");
	}
	public void clkContinueBtn() {
		utillfunnctions.ClickOnElement(continueBtn);
		log.info("shipping details confirmed");
		//continueBtn.click();
	}

}
