package com.testRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.sdp.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\java\\com\\featureFile\\Adactin.feature",
		glue ="com.stepDefinition",
		monochrome=true,
		plugin= {
			"html:Report\\htmlreport",
			"json:Report\\jsonreport.json",
			"pretty",
		//	"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentreport.html"
		},
		tags=("@firstPage,@secondPage")
		
		)

public class TestRunner {
	// method should be public static 
	// two methods setUp and tearDown
public static WebDriver driver;
	@BeforeClass
	public static void set_Up() throws IOException
	{
		driver=BaseClass.webDriverLaunch(FileReaderManager.getInstanceFRM().getInstanceFR().browser());
	}
	
	@AfterClass
	 public static void tear_Down()
	{
		driver.quit();
	}
}
