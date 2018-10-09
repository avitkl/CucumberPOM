package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//td[contains(text(),'User: Avinash TS')]")
	@CacheLookup
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[conatins(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[conatins(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[conatins(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
    
	public boolean verifyCorrectUserName() {
		driver.switchTo().frame("mainpanel");
		boolean flag= usernameLabel.isDisplayed();
		driver.switchTo().defaultContent();
		return flag;
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}
	public void clickOnNewContactLink() {
		Actions action =new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
}
