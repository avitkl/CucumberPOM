package com.qa.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utility.BaseClass;


public class LoginPage extends BaseClass {
	
	//Page Factory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div/input")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//    	js.executeScript("arguments[0].click();", loginBtn);
		
		return new HomePage();
	}

}
