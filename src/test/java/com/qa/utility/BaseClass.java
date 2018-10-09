package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("F:\\JavaSeleniumFramework\\CucumberWithPOM\\src\\test\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}catch(IOException e) {
			e.getMessage();
		}
	}
	
	public static void intialization() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
     		driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(UtilClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		By loadingImage = By.id("preloader");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
