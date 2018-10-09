package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;




public class LoginIntoFreeCRMSteps extends BaseClass{
	LoginPage loginpage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser(){

		BaseClass.intialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page(){
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user log into application$")
	public void user_enters_username_and_password() {

		homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page tile$")
	public void validate_home_page_tile(){
		String homePageTitle=homePage.verifyHomePageTitle();
        Assert.assertEquals("CRMPRO", homePageTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username(){
		boolean flag=homePage.verifyCorrectUserName();
        Assert.assertTrue(flag);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		BaseClass.closeBrowser();
	}

}
