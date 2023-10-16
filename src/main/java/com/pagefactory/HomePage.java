package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	public String shirtprice;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement product;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
	private WebElement productprice;
	
	public void selectProduct() {
		utillfunnctions.ClickOnElement(product);
		log.info("selecting new product");
		//product.click();
		
	}
	public void productrate() {
	    shirtprice=validations.getText(productprice);
		log.info("price is displayed");
	}

}
