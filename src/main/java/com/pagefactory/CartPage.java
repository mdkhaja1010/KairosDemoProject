package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CartPage extends BaseClass {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="button[id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addToCart;
	@FindBy(css = "div[id='shopping_cart_container']")
	private WebElement cartButton;
	public void addToCartBtn() {
		utillfunnctions.explicitWaitToVisibilityOfElement(10, addToCart);
		utillfunnctions.ClickOnElement(addToCart);
		log.info("item added to cart");
		//addToCart.click();
	}
	public void clkCartBtn() {
		utillfunnctions.ClickOnElement(cartButton);
		log.info("opening cart");
		//cartButton.click();
	}
	

}
