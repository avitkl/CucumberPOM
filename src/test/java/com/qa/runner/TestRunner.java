package com.qa.runner;
import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.qa.utility.BaseClass;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\JavaSeleniumFramework\\CucumberWithPOM\\src\\test\\java\\com\\qa\\features\\loginIntoFreeCRM.feature" //path of the feature files
		,glue= {"com.qa.stepDefinitions"}  //path of the step definition files
		//,format= {"pretty","html:test-output","json:json_output/json_result.json","junit:junit_ouput/junit_result.xml"} //To generate different types of reporting
		,monochrome=true  // display the console output in a proper readable format 
		,strict=true // if it is true then test case will start to execute but if there is no step definition for any step then it will throw PendingException
		,dryRun=false // if it true then test case will not executed but it will check all the steps contains steps definitions
		,plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumberReport.html"}
		//,tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}
		)

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport()
	{
		Reporter.loadXMLConfig(new File(BaseClass.prop.getProperty("reportConfigPath")));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Execution Browser", BaseClass.prop.getProperty("browser"));
		Reporter.setSystemInfo("Execution Envinorment", BaseClass.prop.getProperty("envinorment"));		
	}

}
