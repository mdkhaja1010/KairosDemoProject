package com.testscripts;


import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pagefactory.HomePage;
import com.utils.Validations;

public class TC_001Login extends BaseClass{
	HomePage page=new HomePage(driver);
	@Test
	public void buyingProduct() throws InterruptedException 
	
	{
		
		homepage.productrate();
		homepage.selectProduct();
		cartpage.addToCartBtn();
		cartpage.clkCartBtn();
		yourcartpage.cartprice();
		yourcartpage.clkCheckoutButton();
		addresspage.enterFirstName();
		addresspage.enterLastName();
		addresspage.enterzipCode();
		addresspage.clkContinueBtn();
		finishpage.clkFinishBtn();
		home.clkbackHomeButton();
		logoutpage.clkMenubtn();
		logoutpage.clkLogoutbtn();
		

	}
	/*
	 * @Test public void logout() { logoutpage.clkMenubtn();
	 * logoutpage.clkLogoutbtn(); }
	 */
}
