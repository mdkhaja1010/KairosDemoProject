package com.base;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pagefactory.BackToHomePage;
import com.pagefactory.CartPage;
import com.pagefactory.FinishPage;
import com.pagefactory.HomePage;
import com.pagefactory.LogoutPage;
import com.pagefactory.ShippingAddressPage;
import com.pagefactory.YourCartPage;
import com.pagefactory.loginPage;
import com.utils.CreateLog;
import com.utils.DateTime;
import com.utils.PropertyFile;
import com.utils.ReadExcelFile;
import com.utils.UtillFunctions;
import com.utils.Validations;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static WebDriver driver;
	public PropertyFile propertyfile=new PropertyFile();
	public UtillFunctions utillfunnctions= new UtillFunctions(driver);
	public Validations validations=new Validations();
	public ReadExcelFile readexcel=new ReadExcelFile();
	String url=propertyfile.getApplicationUrl();
	String browser=propertyfile.getApplicationBrowser();
	public String userName1=propertyfile.getApplicationUserName();
	public String password1=propertyfile.getApplicationPassword();
	public loginPage loginpage;
	public HomePage homepage;
	public CartPage cartpage;
	public YourCartPage yourcartpage;
	public ShippingAddressPage addresspage;
	public FinishPage finishpage;
	public BackToHomePage home;
	public LogoutPage logoutpage;
	public CreateLog log=new CreateLog();
	public DateTime datetime= new DateTime();
	/*
	 * public String fname=readexcel.readDataFromExcel("Sheet1", 2, 1); public
	 * String lname=readexcel.readDataFromExcel("Sheet1", 2, 2); public String
	 * zip=readexcel.readDataFromExcel("Sheet1", 2, 3);
	 */
	

	@BeforeClass
	public void setup() {
		switch (browser) {
		case "chrome":
			chromeBrowser();
			break;
		case "firefox":
			firefoxBrowser();
			break;
		case "edge":
			edgeBrowser();
			break;
		default:
			error();
		}
	}
	@BeforeMethod
	public void login() throws InterruptedException 
	{
		loginpage = new loginPage(driver);
		homepage=new HomePage(driver);
		cartpage =new CartPage(driver);
		yourcartpage =new YourCartPage(driver);
		addresspage=new ShippingAddressPage(driver);
		finishpage=new FinishPage(driver);
		home=new BackToHomePage(driver);
		logoutpage =new LogoutPage(driver);
		loginpage.enterUserName();
		loginpage.enterPassword();
		loginpage.clkLoginButton();
		loginpage.titleValidations();
		utillfunnctions.scrollDown(driver);
		Thread.sleep(3000);
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,500)");
		 */
		 
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		log.info("Browser closed");
	}

	public void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("ChromeBrowser is launched");
		url();
	}

	public void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		log.info("firefoxBrowser is launched");
		url();
	}

	public void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		url();
		log.info("edge browser is launched");
	}

	public void error() {
		System.err.println("unknown Browser");
		log.info("unknown Browser");
	}

	
	public void url() {
		driver.get(url);
		log.info("Sauce labs url launched");
		driver.manage().window().maximize();
		log.info("window is maximezed");

	}
	public void maximizeBrowser() {
		utillfunnctions.maximizeWindow();
	}

	public String browserName() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browsername = cap.getBrowserName().toLowerCase();
		return browsername;
	}

	public String browserversion() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserversion = cap.getBrowserVersion().toString();
		return browserversion;
	}

}
