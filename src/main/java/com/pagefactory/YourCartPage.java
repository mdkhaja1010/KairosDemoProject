package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class YourCartPage extends BaseClass {
     WebDriver driver;
     public YourCartPage(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
     public String cart;
     @FindBy(css="button[id='checkout']")
     private WebElement checkout;
     @FindBy(xpath="//div[@class='inventory_item_price']")
     private WebElement cartprice;
     
     public void clkCheckoutButton() {
    	utillfunnctions.ClickOnElement(checkout);
    	// checkout.click();
    	log.info("checkout button clicked");
    	
     }
     public void cartprice() {
    	 String cart=validations.getText(cartprice);
    	 log.info("cart price is displayed");
     }
}
