package com.utils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtillFunctions {
	Actions action;
	//JavascriptExecutor js;
	 WebDriver driver;
	 WebDriverWait wait;
	public UtillFunctions(WebDriver driver) {
		this.driver=driver;
	}
	
	public void explicitWaitToVisibilityOfElement(int time,WebElement element) {
		 wait = new  WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void ClickOnElement(WebElement element) {
		element.click();
	}
	public void sendText(WebElement element,String data) {
		element.sendKeys(data);	
	}
	public void moveToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void windowHandle(String title) {
		Set<String> allwindowhandleID = driver.getWindowHandles();
		for (String wind : allwindowhandleID) {
			String currentTitle = driver.switchTo().window(wind).getTitle();
			if (currentTitle.contains(title)) {
				break;
			}
		}
	}
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		//js.executeScript("window.scrollBy(x,y)");
		
	}
	
}
